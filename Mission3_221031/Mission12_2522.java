package Mission3_221031;

import java.io.*;

public class Mission12_2522 {
    //백준#2522
    //별 찍기 - 12
    //  *
    // **
    //***
    // **
    //  *

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//        int n = Integer.parseInt(br.readLine());
        int n = 5;

        for(int i=0; i<n; i++) {
            for(int k=1; k<n-i; k++) {
                sb.append("0");
            }
            for(int k=i; k<n-i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
