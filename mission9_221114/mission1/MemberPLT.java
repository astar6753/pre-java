package mission9_221114.mission1;

public class MemberPLT extends MemberRED {

    public MemberPLT(String memberName, Double bonusPoint) {
        super(memberName, bonusPoint);
        this.memberGrade = "PLATINUM";
        this.bonusRatio = 0.05;
        this.salesRatio = 0.05;
        this.parkingFee = 1000;
    }

    @Override
    public String calPrice(Integer price, Integer stayHour) {
        return super.calPrice(price, stayHour);
    }
}
