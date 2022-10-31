package Mission2_221031;

import java.io.*;
import java.util.Scanner;

public class Mission11_10951 {
    //백준#10951
    //A+B - 4

    //문제
    //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    //입력
    //입력은 여러 개의 테스트 케이스로 이루어져 있다.
    //각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    //출력
    //각 테스트 케이스마다 A+B를 출력한다.

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a+b);
        }
        input.close();
    }
}
