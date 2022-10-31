package Mission2_221031;

import java.io.*;

public class Mission8_2438 {
    //백준#2438
    //별 찍기 - 1

    //문제
    //첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    //입력
    //첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
    //출력
    //첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
    //*
    //**
    //***
    //****
    //*****

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            for(int j = n-i-1; j<n; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}

