package com.mbo.rxmarvel.rxmarvel

import com.marvel.Marvel
import org.junit.Assert.assertNotNull
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    @Test
    fun simpleTest() {
        val characterDataWrapper = Marvel.getApi().getCreatorCollection(null, "spider", null, null, null, null, null, null, null, null)
                .blockingFirst()
        assertNotNull(characterDataWrapper.data.results.first { character -> character.name.equals("Spider-man", true) })
    }

}