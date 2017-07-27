#!/bin/bash

rm  ../src/main/java/com/marvel/model/*.java
rm  ../src/main/java/com/marvel/api/*.java

java -jar swagger-codegen-cl-fdaf8ea65f0.jar generate \
    -i https://gist.githubusercontent.com/wing328/30692487826e07962ae487dbb63a2fa1/raw/acb84d57b575d87431e64d5fb310a3814d5b266b/marvel.openapi.v2.json \
    -l java \
    -o generated \
    --library retrofit2 -DuseRxJava2=true,hideGenerationTimestamp=true,supportJava6=true \
    --api-package com.marvel.api \
    --model-package com.marvel.model

#java -jar swagger-codegen-cl-fdaf8ea65f0.jar generate \
#    -i http://gateway.marvel.com/docs \
#    -l kotlin \
#    -o generated \
#    --model-package com.marvel.model
#
#
mv generated/src/main/java/com/marvel/model/** ../src/main/java/com/marvel/model
mv generated/src/main/java/com/marvel/api/* ../src/main/java/com/marvel/api/
#rm -r generated
