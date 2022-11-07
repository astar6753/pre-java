package peerSession;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        String str1 = br.readLine();
        System.out.println(str1);
        br.close();

        if(str1==""){
            System.out.println();
            throw new IllegalArgumentException("111");    
        }
        
        

    }
}
