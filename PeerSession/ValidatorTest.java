package peerSession;

import java.io.*;
import java.util.regex.Pattern;

public class ValidatorTest {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str1 = br.readLine();

        if(str1.isEmpty() || hasWhiteSpace(str1)) {
            throw new IllegalArgumentException("NOT_INPUT_BLANK", new Throwable("입력값이 비어있거나, 공백이 있습니다."));
        }

        Pattern regex = Pattern.compile("^([1-9]{3})$");
        if(!str1.matches(regex.toString())) {
            throw new IllegalArgumentException("NOT_INPUT_STRING", new Throwable("입력값은 3자리 정수(1-9)만 가능합니다."));
        }

        if(!isValidLength(str1, 3)){
            throw new IllegalArgumentException("INPUT_LIMIT_THREE", new Throwable("입력값이 3자리를 넘습니다. (입력값은 3자리 까지만 가능합니다.)"));
        }
        try {
            Integer.parseInt(str1);
        } catch (NumberFormatException ex1) {
            throw new IllegalArgumentException("NOT_INPUT_STRING", new Throwable("입력값에  문자가 있습니다. (입력값은 정수만 가능합니다.)"));
        }


        System.out.println(str1);
    }

    static Boolean hasWhiteSpace(String str) {
        if(str.length() == str.replace(" ", "").length()) { return false; }
        return true;
    }

    static Boolean isValidLength(String str, int len) {
        if(str.length() != len) { return false; }
        return true;
    }
}

