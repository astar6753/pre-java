package mission9_221114.mission1;

public class Main {

    public static void main(String[] args) {
        MemberRED james = new MemberRED("James", 0.0);
        MemberRED tomas = new MemberRED("Tomas", 0.0);
        MemberRED edward = new MemberPLT("Edward", 0.0);
        MemberRED percy = new MemberPLT("Percy", 0.0);
        MemberRED elizabet = new MemberDIA("Elizabet", 0.0);

        System.out.println(james.calPrice(10000, 2));
        System.out.println(tomas.calPrice(30000, 2));
        System.out.println(edward.calPrice(10000, 2));
        System.out.println(percy.calPrice(30000, 2));
        System.out.println(elizabet.calPrice(30000, 2));
    }
}
