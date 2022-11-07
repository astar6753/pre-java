package mission5_221104.ex02Model;


public class main {
    public static void main(String[] args) {
        Human human = new Human("name", 1, 1, true, 1);
        human.getName();

        String str = human.toGenderStr();
        System.out.println(str);
    }
}
