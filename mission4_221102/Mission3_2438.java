package mission4_221102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission3_2438 {
    //백준#2440
    //별 찍기 - 3
    //*
    //**
    //***
    //****
    //*****

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        br.close();

        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
