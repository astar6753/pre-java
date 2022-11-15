package mission9_221114.mission1;

public class MemberDIA extends MemberRED {

    public MemberDIA(String memberName, Double bonusPoint) {
        super(memberName, bonusPoint);
        this.memberGrade = "DIAMOND";
        this.bonusRatio = 0.1;
        this.salesRatio = 0.1;
        this.parkingFee = 0;
    }

    @Override
    public String calPrice(Integer price, Integer stayHour) {
        return super.calPrice(price, stayHour);
    }

}
