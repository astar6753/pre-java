package mission9_221114.mission1stretagy;

public class Calculator {
    private DiscountStrategy strategy;

    public Calculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public String calPrice(Member member, Integer price, Integer hour) {
        return String.format("%s님의 지불 금액은 %.1f 원이고, 적립 포인트는 %.1f점 입니다.\n주차 요금은 %d원 입니다.",
                member.getMemberName(), this.strategy.getDiscountPrice(price), this.strategy.getBonusPoint(price), this.strategy.getParkingFee(hour));
    }
}
