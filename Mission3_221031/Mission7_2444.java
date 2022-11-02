package mission3_221031;

import java.io.*;

public class Mission7_2444 {
    //백준#2444
    //별 찍기 - 7
    //    *
    //   ***
    //  *****
    // *******
    //*********
    // *******
    //  *****
    //   ***
    //    *

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n-i; j++){
                sb.append(" ");
            }
            sb.append("*");
            for(int k=0; k<i; k++){
                sb.append("**");
            }
            sb.append("\n");
        }
        for(int i=0; i<n; i++){
            for(int k=0; k<i; k++){
                sb.append(" ");
            }
            sb.append("*");
            for(int j=1; j<n-i; j++){
                sb.append("**");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
