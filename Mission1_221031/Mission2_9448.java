package Mission1_221031;

import java.util.Scanner;

public class Mission2_9448 {
    public static void main(String[] args) {
        //백준#9448
        //시험 성적

        //문제
        //시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
        //입력
        //첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
        //출력
        //시험 성적을 출력한다.

        Scanner input = new Scanner(System.in);
        int questInt = input.nextInt();
        switch(questInt/10){
            case 9,10 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            case 6 :
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
        input.close();
    }
}
