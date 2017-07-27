package com.marvel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.marvel.api.PublicApi;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class Marvel {
    private static final String MARVEL_API_URL = "https://gateway.marvel.com/";
    private static final String API_KEY = "apikey";
    private static final String HASH = "hash";
    private static final String TIMESTAMP = "ts";
    private static final String MARVEL_API_KEY = "9ad627bb17a0f3f2a321f873796ccace";
    private static final String MARVEL_PRIVATE_KEY = "a122f26987f4360eabcf7d665524c1e47d5da31a";
    private static final String HASH_STRAT = "MD5";
    // HEX stuff liberated from Apache Hex
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int MILLIS = 1000;

    private static PublicApi singleton;

    private Marvel() {
    }

    public static PublicApi getApi() {
        if (singleton == null) {

            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter())
                    .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                    .create();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();
                    HttpUrl originalHttpUrl = original.url();

                    long ts = System.currentTimeMillis() / MILLIS;

                    HttpUrl url = originalHttpUrl.newBuilder()
                            .addQueryParameter(API_KEY, MARVEL_API_KEY)
                            .addQueryParameter(HASH, getHash(ts))
                            .addQueryParameter(TIMESTAMP, Long.toString(ts))
                            .build();

                    // Request customization: add request headers
                    Request.Builder requestBuilder = original.newBuilder()
                            .url(url);

                    Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });

            HttpLoggingInterceptor logger = new HttpLoggingInterceptor();
            logger.setLevel(HttpLoggingInterceptor.Level.BASIC);
            builder.addInterceptor(logger);

            String baseUrl = MARVEL_API_URL;
            if (!baseUrl.endsWith("/"))
                baseUrl = baseUrl + "/";

            singleton = new Retrofit
                    .Builder()
                    .baseUrl(baseUrl)
                    .client(builder.build())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
                    .create(PublicApi.class);
        }

        return singleton;
    }

    private static String getHash(long ts) {
        try {
            MessageDigest hasher = MessageDigest.getInstance(HASH_STRAT);

            byte[] hash = hasher.digest((ts + MARVEL_PRIVATE_KEY + MARVEL_API_KEY).getBytes());
            final int l = hash.length;
            final char[] out = new char[l << 1];
            // two characters form the hex value.
            for (int i = 0, j = 0; i < l; i++) {
                out[j++] = DIGITS_LOWER[(0xF0 & hash[i]) >>> 4];
                out[j++] = DIGITS_LOWER[0x0F & hash[i]];
            }
            return new String(out);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Gson TypeAdapter for Joda DateTime type
     */
    static class DateTimeTypeAdapter extends TypeAdapter<DateTime> {

        private final DateTimeFormatter parseFormatter = ISODateTimeFormat.dateOptionalTimeParser();
        private final DateTimeFormatter printFormatter = ISODateTimeFormat.dateTime();

        @Override
        public void write(JsonWriter out, DateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(printFormatter.print(date));
            }
        }

        @Override
        public DateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return parseFormatter.parseDateTime(date);
            }
        }
    }

    /**
     * Gson TypeAdapter for Joda LocalDate type
     */
    static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private final DateTimeFormatter formatter = ISODateTimeFormat.dateOptionalTimeParser();

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.print(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return formatter.parseLocalDate(date);
            }
        }
    }
}
