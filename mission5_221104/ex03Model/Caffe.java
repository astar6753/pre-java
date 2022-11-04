package mission5_221104.ex03Model;

import java.util.ArrayList;
import java.util.List;

public class Caffe {
    private String name;
    private List<Beverage> menu;

    public Caffe(String name) {
        this.name = name;
    }

    public void addMenu(Caffe caffe, Beverage beverage) {
        List<Beverage> menu = new ArrayList<>();
        menu.add(beverage);
        caffe.setMenu(menu);
    }

    public String getName() {
        return name;
    }

    public void setMenu(List<Beverage> menu) {
        this.menu = menu;
    }
}
