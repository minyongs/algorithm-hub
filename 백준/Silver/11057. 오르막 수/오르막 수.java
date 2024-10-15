
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        long[][] dp = new long[n+1][10];//길이가 n인 숫자 중 마지막 자리가 10 인 오르막수 갯수

        for (int j = 0; j <= 9; j++) { // 1~10은 항상 1
            dp[1][j] = 1;
        }

        for (int i = 2; i <= n; i++) { // 길이가 2부터 n까지의 오르막 수
            for (int j = 0; j <= 9; j++) { // 마지막 자릿수가 0부터 9까지인 경우
                dp[i][j] = 0; // 현재 dp[i][j] 값을 0으로 초기화
                for (int k = 0; k <= j; k++) { // 마지막 자릿수가 j인 경우, 앞자리로 가능한 0부터 j까지의 모든 수를 더함
                    dp[i][j] += dp[i-1][k]; // 앞자리가 k인 오르막 수의 경우의 수를 더함
                    dp[i][j] %= 10007; // 10007로 나눈 나머지를 저장 (큰 수 처리를 위한 모듈러 연산)
                }
            }
        }
        int ans = 0;
        for(int i = 0 ; i <=9; i++){
            ans += dp[n][i];
            ans %= 10007;
        }
        System.out.println(ans);
    }
}
