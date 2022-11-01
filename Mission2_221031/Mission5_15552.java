package Mission2_221031;

import java.io.*;

public class Mission5_15552 {
    //백준#15552
    //빠른 A+B

    //문제
    //본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
    //Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
    //또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.

    //입력
    //첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
    //출력
    //각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(i>0) {
            String question = br.readLine();
            String ab[] = question.split(" ");
            sb.append(Integer.parseInt(ab[0])+Integer.parseInt(ab[1])).append("\n");
            i--;
        }
        System.out.println(sb);
    }
}
