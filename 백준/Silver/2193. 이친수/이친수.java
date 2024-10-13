

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static long[] dp = new long[91];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3 ; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2]; //점화식
        }
        System.out.println(dp[n]);
    }
}
//1자리 : 1 (1개)
//2자리 : 10 (1개)
//3자리 : 101 100 (2개)
//4자리 : 1000 1001 1010(3개)
