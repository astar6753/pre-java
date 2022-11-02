package mission3_221031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission4_2441 {
    //백준#2441
    //별 찍기 - 4
    //*****
    // ****
    //  ***
    //   **
    //    *

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//        i 5
//        j 0 1 2 3 4
//        k 5 4 3 2 1

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                sb.append(" ");
            }
            for(int k=1; k<n-i+1; k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
