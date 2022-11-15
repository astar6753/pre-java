package mission9_221114.mission1enum;


public class Main {
    public static void main(String[] args) {

        Member james = new Member("James", 0.0, Grade.RED);
        Member tomas = new Member("Tomas", 0.0, Grade.RED);
        Member edward = new Member("Edward", 0.0, Grade.PLATINUM);
        Member percy = new Member("Percy", 0.0, Grade.PLATINUM);
        Member elizabet = new Member("Elizabet", 0.0, Grade.DIAMOND);

        System.out.println(james.calPrice(10000, 2));
        System.out.println(tomas.calPrice(30000, 2));
        System.out.println(edward.calPrice(10000, 2));
        System.out.println(percy.calPrice(30000, 2));
        System.out.println(elizabet.calPrice(30000, 2));
    }
}
