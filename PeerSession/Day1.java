package peerSession;

public class Day1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("aaa  aaa  ");
        System.out.println(sb);
        sb.insert(1,"b");
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb);
    }
}
