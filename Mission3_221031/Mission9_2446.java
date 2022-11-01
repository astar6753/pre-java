package Mission3_221031;

import java.io.*;

public class Mission9_2446 {
    //백준#2446
    //별 찍기 - 9
    //********* 0 9 0 0 n*2-i-1
    // *******  1 7 1 1 n*2-i-1
    //  *****   2 5 2 2
    //   ***    3 3 3
    //    *     4 1 4
    //   ***    3 3
    //  *****   2 5
    // *******  1 7
    //********* 0 9

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
//        int n = 5;

        for(int i=0; i<n; i++) {
            for(int k=0; k<i; k++) {
                sb.append(" ");
            }
            for(int j=0; j<n-i-1; j++) {
                sb.append("**");
            }
            sb.append("*\n");
        }
        for(int i=n-1; i>0; i--) {
            for(int k=1; k<i; k++) {
                sb.append(" ");
            }
            for(int j=-1; j<n-i-1; j++) {
                sb.append("**");
            }
            sb.append("*\n");
        }

        System.out.println(sb);
    }
}
