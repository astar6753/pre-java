package mission9_221114.mission1;

public class MemberRED {
    protected String memberName;
    protected Double bonusPoint;
    protected String memberGrade;
    protected Double bonusRatio;
    protected Double salesRatio;
    protected Integer parkingFee;

    public MemberRED(String memberName, Double bonusPoint) {
        this.memberName = memberName;
        this.bonusPoint = bonusPoint;
        this.memberGrade = "RED";
        this.bonusRatio = 0.01;
        this.salesRatio = 0.01;
        this.parkingFee = 3000;
    }

    public String calPrice(Integer price, Integer stayHour) {
        Double sales = price - (price * this.salesRatio);
        Double bonus = price * this.bonusRatio;
        Integer parking = this.parkingFee * stayHour;
        return String.format("%s님의 지불 금액은 %.1f 원이고, 적립 포인트는 %.1f점 입니다.\n주차 요금은 %d원 입니다.",
                memberName, sales, bonus, parking);
    }
}
