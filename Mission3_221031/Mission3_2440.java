package Mission3_221031;

import java.io.*;

public class Mission3_2440 {
    //백준#2440
    //별 찍기 - 3
    //*****
    //****
    //***
    //**
    //*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++) {
            for(int j = n-i; j > 0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
