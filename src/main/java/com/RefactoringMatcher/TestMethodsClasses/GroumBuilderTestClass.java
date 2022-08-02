package com.RefactoringMatcher.TestMethodsClasses;

import java.util.Locale;

public class GroumBuilderTestClass {
    public Locale BuilderTest() {
        Locale aLocale = new Locale.Builder().setLanguage("sr").setScript("Latn").setRegion("RS").build();
        return aLocale;
    }
}