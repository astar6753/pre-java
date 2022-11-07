package mission5_221104;

import mission5_221104.ex02Model.Human;

//코드스쿼드_221103
//1주차. 객체지향 프로그래밍1 / 미션 #2 / #Q2
public class MissionClassMethod2 {
    //사람이 있습니다.
    //이름은 제인, 나이는 30세 입니다.
    //여성이고, 결혼 했고, 아이는 한 명이 있습니다.
    //이 사람에 대한 정보를 다음과 같이 출력해보세요
    //인스턴스를 생성할 때 이름은 생성자의 매개변수로 받습니다.

    public static void main(String[] args) {
        Human jane = new Human("Jane", 30, 2, true, 1);
        jane.showInfo();
        System.out.println(jane.toString());
    }

}
