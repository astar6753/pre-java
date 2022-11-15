package mission9_221114.mission1stretagy;

public class GradeREDDiscountStrategy implements DiscountStrategy {

    @Override
    public Double getDiscountPrice(Integer price) {
        return price * 0.99;
    }

    @Override
    public Double getBonusPoint(Integer price) {
        return price * 0.01;
    }

    @Override
    public Integer getParkingFee(Integer hour) {
        return 3000 * hour;
    }
}
