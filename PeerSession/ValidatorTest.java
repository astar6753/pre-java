package peerSession;

import java.io.*;
import java.util.regex.Pattern;

public class ValidatorTest {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        //공백검사
        if(str.isEmpty() || hasWhiteSpace(str)) {
            throw new IllegalArgumentException("ERR_INPUT_BLANK", new Throwable("입력값이 비어있거나, 공백이 있습니다."));
        }

        //정규식으로 유효값 검증 - 3자리 숫자(1-9)
        final Pattern REGEX = Pattern.compile("^([1-9]{3})$");
        if(!str.matches(REGEX.toString())) {
            throw new IllegalArgumentException("ERR_INPUT_INVALID_PATTERN", new Throwable("입력값은 3자리의 숫자(1-9)만 가능합니다."));
        }

        //정규식을 사용하지 않았을 경우
        //각 예외마다 처리를 세세하게 해줄 수 있으나, 검증이 피곤해진다.
        //3자리 // 숫자만 // 1-9만
        if(!isValidLength(str, 3)){
            throw new IllegalArgumentException("ERR_EXCEED_LIMIT", new Throwable("입력값이 3자리를 넘습니다."));
        }
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException ex1) {
            throw new IllegalArgumentException("ERR_INPUT_STRING", new Throwable("입력값은 1-9사이 정수만 가능합니다. (0은 입력할 수 없습니다.)"));
        }

        System.out.println(str);
    }

    private static Boolean hasWhiteSpace(String str) {
        return str.length() != str.replace(" ", "").length();
    }

    private static Boolean isValidLength(String str, int limit) {
        return str.length() == limit;
    }

    private static Boolean isValidNumber(Integer number, int min, int max) {
        return min <= number && number <= max;
    }
}

