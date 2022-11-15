package mission8_221110.addtional1;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
