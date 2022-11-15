package mission9_221114.mission1stretagy;

public class Main {

    public static void main(String[] args) {


        Member james = new Member("James", 0.0, Member.Grade.RED);
        Member tomas = new Member("Tomas", 0.0, Member.Grade.RED);
        Member edward = new Member("Edward", 0.0, Member.Grade.PLATINUM);
        Member percy = new Member("Percy", 0.0, Member.Grade.PLATINUM);
        Member elizabet = new Member("Elizabet", 0.0, Member.Grade.DIAMOND);

        Calculator calRed = new Calculator(new GradeREDDiscountStrategy());
        Calculator calPlatinum = new Calculator(new GradePLTDiscountStrategy());
        Calculator calDiamond = new Calculator(new GradeDIADiscountStrategy());

        System.out.println(calRed.calPrice(james, 10000, 2));
        System.out.println(calRed.calPrice(tomas, 30000, 2));
        System.out.println(calPlatinum.calPrice(edward, 10000, 2));
        System.out.println(calPlatinum.calPrice(percy, 30000, 2));
        System.out.println(calDiamond.calPrice(elizabet, 30000, 2));



    }
}
