
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
    n = 1 -> 1
    n = 2 -> 2
    n = 3 -> {001,100,111} 3
    n = 4 -> {0011 0000 1001 1100 1111} 5
    dp[n] = dp[n-1] + dp[n-2]
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1000001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 5;

        for(int i = 5; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }
        System.out.println(dp[n]);
    }
}
