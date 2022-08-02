package ca.concordia.refactoringmatcher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.StringBuffer;

public class GroumReturnTestClass {

    private static void groumTestMethod() throws IOException {
        StringBuffer strbuf = new StringBuffer();
        BufferedReader in = new BufferedReader(new FileReader(""));

        String str;

        while((str = in.readLine()) != null ) {
            strbuf.append(str + "\n");
        }

        if(strbuf.length() > 0) {
            outputMessage(strbuf.toString());
            return;
        }

        in.close();
        return;
    }

    private static void outputMessage(String s) {
    }

}
