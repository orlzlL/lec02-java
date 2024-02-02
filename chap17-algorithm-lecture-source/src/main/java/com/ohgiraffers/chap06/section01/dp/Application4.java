package com.ohgiraffers.chap06.section01.dp;

import java.io.*;
import java.util.StringTokenizer;

public class Application4 {

    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }
    
    public static int solution(String input)throws IOException{
        BufferedReader br = toBufferedReader(input);
        
        int n = Integer.valueOf(br.readLine());
        
        int dp[][] = new int[n + 1][n + 1];
        int p[][] = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                p[i][j] = Integer.valueOf(st.nextToken());
            }

        }
    }
}

