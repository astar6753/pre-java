package additionalMission_221101;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Mission5_Switch {
    //5. Scanner, Switch, 분기문 익히기
    //사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 합니다.
    //연산자는 +, -, *, /의 네 가지로 하고 피연산자는 모두 실수로 합시다!
    //피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력하고,
    //0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료해주세요!
    //연산>> 2 + 4
    //2.0+4.0의 계산 결과는 6.0
    //(1) 연산 식을 구분할 때 if-else 문을 이용하여 프로그램을 작성해보시고,
    //(2) 연산 식을 구분할 때 switch 문을 이용하여 작성도 해보세요!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        sc.close();

        double x = Double.parseDouble(st.nextToken());
        String operator = st.nextToken();
        double y = Double.parseDouble(st.nextToken());
        double answer = 0;
        switch (operator) {
            case "+":
                answer = x + y;
                break;
            case "-":
                answer = x - y;
                break;
            case "*":
                answer = x * y;
                break;
            case "/":
                answer = x / y;
                break;
        }
        if(y!=0) {
            System.out.println(x+operator+y+"="+answer);
        }
        else {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
