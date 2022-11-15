package mission6_221107.mission1;

import java.util.Arrays;

public class Mission {
    //1 . 문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력하기

    public static void main(String[] args) {
        char[] alphabetArr = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabetArr[i] = (char)(i + 'A');
        }
        System.out.println("Alphabet : " + Arrays.toString(alphabetArr));
    }
}
