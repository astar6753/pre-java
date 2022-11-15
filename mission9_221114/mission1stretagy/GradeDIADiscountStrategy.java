package mission9_221114.mission1stretagy;

public class GradeDIADiscountStrategy implements DiscountStrategy {

    @Override
    public Double getDiscountPrice(Integer price) {
        return price * 0.9;
    }

    @Override
    public Double getBonusPoint(Integer price) {
        return price * 0.1;
    }

    @Override
    public Integer getParkingFee(Integer hour) {
        return 0;
    }
}
