
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        
        BigInteger[] dp = new BigInteger[Math.max(n + 1, 4)];

        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;
        dp[2] = BigInteger.ONE;
        dp[3] = BigInteger.valueOf(2);

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        System.out.println(dp[n]);
    }
}
