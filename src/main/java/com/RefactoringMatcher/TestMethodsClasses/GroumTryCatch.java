package com.RefactoringMatcher.TestMethodsClasses;

import java.lang.*;

public class GroumTryCatch {
    /*public static void throwsTest() throws IllegalAccessException {
        String ss = "string";
        if (ss.length() == 0) {
            throw new IllegalAccessException("demo");
        }
    }*/

    static void throwsWithTryTest()
    {
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
