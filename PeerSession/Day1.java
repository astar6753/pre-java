package peerSession;

public class Day1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("aaa  aaa  aa ");
        System.out.println(sb);
        sb.insert(1,"b");
        System.out.println(sb);
        System.out.println(sb.indexOf("aaa"));
        sb.trimToSize();
        sb.append("aaa  aaa  aa ");
        System.out.println(sb);
        System.out.println(sb.indexOf("aaa",sb.indexOf("aaa")+1));

    }
}
