package mission5_221104;

import mission5_221104.ex03Model.*;

//코드스쿼드_221103
//1주차. 객체지향 프로그래밍1 / 미션 #3 / #Q3
public class MissionClassMethod3 {
    //3 James와 Tomas는 아침이면 출근 길에 커피를 마십니다.
    //James는 5000원을 가지고 있었고, 별다방에 서아메리카노를 마시면서 4000원을 지불했습니다.
    //Tomas는 10000원을 가지고 있었고, 콩다방에서 라떼를 마시면서 5000원을 지불합니다.
    //두 사람의 남은 금액을 다음과 같이 출력하세요

    public static void main(String[] args) {

        Caffe starCaffe = new Caffe("별다방");
        Beverage americano = new Beverage("아메리카노",4000);
        starCaffe.addMenu(starCaffe,americano);

        Caffe beanCaffe = new Caffe("콩다방");
        Beverage latte = new Beverage("라떼",5000);
        starCaffe.addMenu(beanCaffe,latte);

        Customer james = new Customer("James",5000);
        Customer tomas = new Customer("Tomas",10000);

        james.orderBeverage(james,starCaffe,americano);
        james.orderBeverage(tomas,beanCaffe,latte);

    }
}
