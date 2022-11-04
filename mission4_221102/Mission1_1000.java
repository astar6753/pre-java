package mission4_221102;

import java.io.*;

public class Mission1_1000 {
    //백준#1000 A+B

    //문제
    //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String question = br.readLine();
        br.close();

        String ab[] = question.split(" ");
        sb.append(Integer.parseInt(ab[0])+Integer.parseInt(ab[1])).append("\n");

        System.out.println(sb);
    }
}
