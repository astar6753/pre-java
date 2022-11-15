package mission9_221114.mission1stretagy;

public interface DiscountStrategy {
    Double getDiscountPrice(Integer price);
    Double getBonusPoint(Integer price);
    Integer getParkingFee(Integer hour);
}
