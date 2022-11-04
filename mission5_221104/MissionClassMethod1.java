package mission5_221104;

import mission5_221104.ex01Model.Calculator;
import mission5_221104.ex01Model.Number;

//코드스쿼드_221103
//1주차. 객체지향 프로그래밍1 / 미션 #2 / #Q1
public class MissionClassMethod1 {
    //두 수 10, 2를 속성 값으로 가지는 클래스를 만들고
    //이를 사칙연산 하는 클래스와 이를 사용하는 클래스를 따로 만들어 사칙연산의 출력결과를 출력하세요

    public static void main(String[] args) {
        Number number = new Number();
        Calculator cal = new Calculator();

        System.out.println(number.getX()+"+"+ number.getY()+"="+ cal.plus(number.getX(), number.getY()));
        System.out.println(number.getX()+"-"+ number.getY()+"="+ cal.minus(number.getX(), number.getY()));
        System.out.println(number.getX()+"*"+ number.getY()+"="+ cal.product(number.getX(), number.getY()));
        System.out.println(number.getX()+"/"+ number.getY()+"="+ cal.divide(number.getX(), number.getY()));
    }
}
