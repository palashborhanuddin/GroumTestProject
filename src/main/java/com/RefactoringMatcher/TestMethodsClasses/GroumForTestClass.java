package com.RefactoringMatcher.TestMethodsClasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GroumForTestClass {

    private void groumTestMethod() throws IOException {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        for (String str : strings) {
            System.out.println(str);
        }

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}