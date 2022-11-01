package AdditionalMission_221101;

import java.util.Scanner;

public class Mission3 {
    //3. if 논리 연습하기
    //2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현할것 입니다!
    //(100, 100)과 (200, 200)의 두 점으로 이루어진 사각형이 있을 때, Scanner를 이용하여 양의정수 x와
    //y값을 입력받고 점 (x, y)가 이 직사각형 안에 있는지를 판별하는 프로그램을 작성하시죠!
    //점 (x, y)의 좌표를 입력하시오>>150 130
    //(150, 130)는 안에 있습니다.
    //
    //점 (x, y)의 좌표를 입력하시오>>300 300
    //(300, 300)는 밖에 있습니다.

    public static void main(String[] args) {
        System.out.print("점 (x, y)의 좌표를 입력하시오>>");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        if(x>=100 && x<=200 && y>=100 && y<=200){
            System.out.println("("+x+","+y+")는 안에 있습니다.");
        }
        else {
            System.out.println("("+x+","+y+")는 밖에 있습니다.");
        }
    }
}
