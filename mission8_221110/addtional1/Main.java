package mission8_221110.addtional1;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyStore.orderPizza("cheese");
        Pizza nyClamPizza = nyStore.orderPizza("clam");

        Pizza chicagoCheesePizza = chicagoStore.orderPizza("cheese");
        Pizza chicagoClamPizza = chicagoStore.orderPizza("clam");
    }
}
