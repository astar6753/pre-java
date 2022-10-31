package Mission3_221031;

import java.io.*;

public class Mission3_2443 {
    //백준#2443
    //별 찍기 - 6
    //*********
    // *******
    //  *****
    //   ***
    //    *

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
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
