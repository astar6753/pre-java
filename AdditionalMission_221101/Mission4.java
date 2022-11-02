package additionalMission_221101;

import java.util.Scanner;

public class Mission4 {
    //4. 조건문과 함수 연습
    //2차원 평면에서 직사각형은 바로 직전 문제 3번처럼 두 점으로 표현할수가 있습니다.
    //키보드로부터 직사각형을 구성하는 두 점 (x1, y1), (x2, y2)를 입력받아 (100, 100), (200, 200)의 두
    //점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성해주세요!
    //Hint
    //다음은 점 (x,y)가 (rectx1, recty1), (rectx2, recty2)의 사각형 안에 있으면 true를 리턴하는 메소
    //드입니다. 메소드를 활용해보심이??

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 점 (x1, y1)의 좌표를 입력하시오>>");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("2번째 점 (x2, y2)의 좌표를 입력하시오>>");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        sc.close();

        if(isInRect(x1,y1,100,100,200,200) && isInRect(x2,y2,100,100,200,200)){
            System.out.println("직사각형은 안에 있습니다.");
        }
        else {
            System.out.println("직사각형은 밖에 있습니다.");
        }
    }
    public static boolean isInRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
            return true;
        } else {
            return false;
        }
    }
}
