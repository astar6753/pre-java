package Mission3_221031;

import java.io.*;

public class Mission8_2445_runtime {
    //백준#2445
    //별 찍기 - 8
    //*        * 1 8 1  1 n*2-1*2 1
    //**      ** 2 6 2  2 n*2-1*2 2
    //***    *** 3 4 3  3
    //****  **** 4 2 4
    //********** 5 0 5
    //****  **** 4 2 4
    //***    *** 3 4 3
    //**      ** 2 6 2
    //*        * 1 8 1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
//        int n = 5;

        for(int i=n-1; i>0; i--) {
            for(int j=0; j<n-i; j++) {
                sb.append("*");
            }
            for(int k=0; k<i; k++) {
                sb.append("  ");
            }
            for(int l=0; l<n-i; l++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                sb.append("*");
            }
            for(int k=0; k<i; k++) {
                sb.append("  ");
            }
            for(int l=0; l<n-i; l++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
