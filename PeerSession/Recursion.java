package peerSession;

public class Recursion {
    public static void main(String[] args) {
        retry(0);
//        System.out.println(factorial(5));
    }
    public static void retry(int count) {
        if(count > 10) { return; }
        System.out.println(count);
        retry(count+1);
    }

    public static int factorial(int x) {
        if (x <= 1) return x;
        return factorial(x-1) * x;
    }
}
