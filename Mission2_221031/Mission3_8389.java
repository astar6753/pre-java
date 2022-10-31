package Mission2_221031;

import java.util.Scanner;

public class Mission3_8389 {
    //백준#8389
    //합

    //문제
    //n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
    //입력
    //첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
    //출력
    //1부터 n까지 합을 출력한다.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int time = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=time; i++) {
            sum += i;
        }
        System.out.println(sum);
        input.close();
    }

}