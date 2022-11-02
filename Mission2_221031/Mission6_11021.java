package mission2_221031;

import java.io.*;

public class Mission6_11021 {
    //백준#11021
    //A+B - 7

    //문제
    //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    //입력
    //첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    //각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    //출력
    //각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String question = br.readLine();
            String ab[] = question.split(" ");
            sb.append("Case #"+(i+1)+": ").append(Integer.parseInt(ab[0])+Integer.parseInt(ab[1])).append("\n");
        }
        System.out.println(sb);
    }
}
