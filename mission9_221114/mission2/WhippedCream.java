package mission9_221114.mission2;

public class WhippedCream extends Decorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding WhippedCream");
    }
}
