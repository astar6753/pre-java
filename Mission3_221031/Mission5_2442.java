package mission3_221031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission5_2442 {
    //백준#2442
    //별 찍기 - 5
    //    *
    //   ***
    //  *****
    // *******
    //*********

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//        i 5
//        j 4 3 2 1 0
//        k 1 3 5 7 9

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            for(int j=1; j<n-i; j++){
                sb.append(" ");
            }
            sb.append("*");
            for(int k=0; k<i; k++){
                sb.append("**");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
