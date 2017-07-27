package com.mbo.rxmarvel.rxmarvel

import com.marvel.Marvel
import org.junit.Assert.assertNotNull
import org.junit.Test

class MarvelKotlinTest {

    @Test
    fun simpleTest() {
        val characterDataWrapper = Marvel.getApi().getCreatorCollection(null, "spider", null, null, null, null, null, null, null, null)
                .blockingFirst()
        assertNotNull(characterDataWrapper.data.results.first { character -> character.name.equals("Spider-man", true) })
    }

}