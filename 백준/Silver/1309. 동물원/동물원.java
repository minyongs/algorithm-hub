
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    private static final int MOD = 9901;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[][] dp = new long[n][3]; // n 번째 열에 사자가 배치되었는가 ?
        dp[0][0] = dp[0][1] = dp[0][2] = 1; // 0 번째 열은 사자가 없거나 , 왼쪽에 한마리거나 , 오른쪽에 한마리거나 ->경우의 수는 모두 1

        for(int i = 1 ; i < n; i++){
            dp[i][0] = (dp[i-1][0] + dp[i - 1][1] +dp[i-1][2]) % MOD; // 현재 열에 사자를 배치 하지 않았다 => 모든 경우의 수 가능 !
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % MOD; // 왼쪽에만 사자를 배치한 경우 => 아랫줄에 사자가 배치되어 있지 않거나 , 오른쪽에 배치됐을때 가능 !
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % MOD; // 오른쪽에만 사자를 배치한 경우 => 아랫줄에 사자가 배치되어 있지 않거나 , 왼쪽에 배치됐을때 가능 !
        }
        long ans = 0;
        for(int i = 0 ; i < 3; i++){
            ans += dp[n-1][i]; // 아랫줄의 경우를 모두 더함
        }

        System.out.println(ans % MOD);

    }
}
