package mission3_221031;

import java.io.*;

public class Mission8_2445 {
    //백준#2445
    //별 찍기 - 8
    //*        * 1 4 4 1  1 n-i
    //**      ** 2 3 3 2
    //***    *** 3 2 2 3
    //****  **** 4 1 1 4
    //********** 5 0 0 5
    //****  **** 4 1 1 4
    //***    *** 3 2 2 3
    //**      ** 2 3 3 2
    //*        * 1 4 4 1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//        int n = Integer.parseInt(br.readLine());
        int n = 5;

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++) {
                sb.append("*");
            }
            for(int j=n-i; j>1; j--){
                sb.append("  ");
            }
            for(int j=0; j<i+1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=n; i>1; i--){
            for(int j=0; j<i-1; j++) {
                sb.append("*");
            }
            for(int j=n-i; j>-1; j--){
                sb.append("  ");
            }
            for(int j=0; j<i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
