package mission5_221104;

import mission5_221104.ex04Model.MyDate;

//코드스쿼드_221103
//1주차. 객체지향 프로그래밍1 / 미션 #2 / #Q4
public class MissionClassMethod4 {
    //MyDateTest
    //4 다음 코드가 실행되어 출력이 그림과 같도록 MyDate를 구현하세요
    //(에러라고 쓰여있는 부분은 그 부분에서 에러가 나도록 해야 합니다 )

    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(300, 2, 2006);
        System.out.println(date2.isValid());

//		date1.day =10;   에러
//		date1.month = 3; 에러
//		date1.year = 2020; 에러

    }
}
