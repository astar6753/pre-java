package mission9_221114.mission2;

public class Decorator extends Coffee {

    private Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
