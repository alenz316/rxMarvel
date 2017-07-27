package com.mbo.rxmarvel.rxmarvel;

import com.marvel.Marvel;
import com.marvel.model.CharacterDataWrapper;

import org.junit.Test;

public class MarvelApiTest {

    @Test
    public void simpleTest() {
        CharacterDataWrapper characterDataWrapper = Marvel.getApi().getCreatorCollection(
                null, "spider", null, null, null,
                null, null, null, null, null)
                .blockingFirst();
        System.out.println(characterDataWrapper.getData().getResults().get(0));
    }
}
