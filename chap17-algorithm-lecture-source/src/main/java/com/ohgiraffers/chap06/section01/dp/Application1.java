package com.ohgiraffers.chap06.section01.dp;

public class Application1 {
    public static int solution(int N) throws Exception{
        int[] dp = new int[N + 1];

        if(N >= 3) dp[3] = 1;
        if(N >= 5) dp[5] = 1;

        return dp[N];
    }

}
