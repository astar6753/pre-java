package mission6_221107.mission3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<TestObj> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new TestObj(i,i));
        }
        System.out.println(list);

        list.addAll(list);
        System.out.println(list);

        TestObj a = new TestObj(10,10);
        list.set(0, a);
        System.out.println(list);

        ArrayList<TestObj> list2 = list;
        System.out.println(list2);
    }
}

class TestObj {
    private int x;
    private int y;

    public TestObj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "TestObj{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
