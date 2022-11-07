package practice01_221104.modifier02.Menu;

import java.util.List;

public class Menu {
    private List<Dish> dishList;
    private List<Drink> drinkList;

    public Menu(List<Dish> dishList, List<Drink> drinkList) {
        this.dishList = dishList;
        this.drinkList = drinkList;
    }

    public Dish chooseDish(String name) {
        for(Dish dish : dishList) {
            if (dish.getName().equals(name)) {
                return dish;
            }
        }
        return null;
    }

    public Drink chooseDrink(String name) {
        for(Drink drink : drinkList) {
            if (drink.getName().equals(name)) {
                return drink;
            }
        }
        return null;
    }
}
