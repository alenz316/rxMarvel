package com.mbo.rxmarvel.rxmarvel.characters;

import com.marvel.model.Character;
import com.marvel.model.Comic;
import com.marvel.model.Image;

public class CharacterViewModel {

    public final Character character;
    public final Comic firstIssue;
    public final String squareImageUrl;

    public CharacterViewModel(Character character, Comic firstIssue) {
        this.character = character;
        this.firstIssue = firstIssue;
        Image thumbnail = character.getThumbnail();
        this.squareImageUrl = thumbnail.getPath() + CharacterMeta.IMAGE_POSTFIX_STANDARD_FANTASTIC + thumbnail.getExtension();
    }
}
