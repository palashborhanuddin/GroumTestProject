package com.RefactoringMatcher.TestMethodsClasses;

public class GroumThrow {

    static void throwsWithTryTest() throws IllegalAccessException {
        String ss = "string";
        if (ss.length() == 0) {
            throw new IllegalAccessException("demo");
        }

        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside func.");
            throw e; // rethrowing the exception
        }
    }
}
