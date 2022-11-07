package practice01_221104.modifier02.Human;

import practice01_221104.modifier02.Menu.Menu;

public class Customer extends Human {

    public Customer(String name, Integer age) {
        super(name, age);
    }

    public void order(String name, Menu menu) {
        menu.chooseDish(name);
        menu.chooseDrink(name);
    }
}
