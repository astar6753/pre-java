package mission9_221114.mission1enum;

public class Member {
    protected String memberName;
    protected Double bonusPoint;
    protected Grade memberGrade;

    public Member(String memberName, Double bonusPoint, Grade memberGrade) {
        this.memberName = memberName;
        this.bonusPoint = bonusPoint;
        this.memberGrade = memberGrade;
    }

    public String calPrice(Integer price, Integer stayHour) {
        Double sales = price - (price * this.memberGrade.getSalesRatio());
        Double bonus = price * this.memberGrade.getBonusRatio();
        Integer parking = this.memberGrade.getParkingFee() * stayHour;
        return String.format("%s님의 지불 금액은 %.1f 원이고, 적립 포인트는 %.1f점 입니다.\n주차 요금은 %d원 입니다.",
                memberName, sales, bonus, parking);
    }
}

enum Grade {
    RED(0.01, 0.01, 3000),
    PLATINUM(0.05, 0.05, 2000),
    DIAMOND(0.1, 0.1, 0),
    ;

    private Double bonusRatio;
    private Double salesRatio;
    private Integer parkingFee;

    Grade(Double bonusRatio, Double salesRatio, Integer parkingFee) {
        this.bonusRatio = bonusRatio;
        this.salesRatio = salesRatio;
        this.parkingFee = parkingFee;
    }

    public Double getBonusRatio() {
        return bonusRatio;
    }

    public Double getSalesRatio() {
        return salesRatio;
    }

    public Integer getParkingFee() {
        return parkingFee;
    }
}