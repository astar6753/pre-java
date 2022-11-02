package mission4_221102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission2_1008 {
    //백준#1008 A/B
    //두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String question = br.readLine();
        String ab[] = question.split(" ");
        sb.append(Double.parseDouble(ab[0])/Double.parseDouble(ab[1])).append("\n");
        System.out.println(sb);
    }
}
