package mission9_221114.mission1stretagy;

public class GradePLTDiscountStrategy implements DiscountStrategy {

    @Override
    public Double getDiscountPrice(Integer price) {
        return price * 0.95;
    }

    @Override
    public Double getBonusPoint(Integer price) {
        return price * 0.05;
    }

    @Override
    public Integer getParkingFee(Integer hour) {
        return 2000 * hour;
    }
}
