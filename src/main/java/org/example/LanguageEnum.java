package org.example;

public enum LanguageEnum {
    ENGLISH("en"),
    RUSSIAN("ru");

    private String shortName;

    public String getShortName() {
        return shortName;
    }

    // enum constructor - can not be public or protected
    LanguageEnum(String shortName) {
        this.shortName = shortName;
    }
}