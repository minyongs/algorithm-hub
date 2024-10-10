

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long mod = 1000000000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n + 1][10];

        // 첫 번째 자릿수 초기화 (0부터 9까지의 숫자)
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1; // 첫 번째 자릿수에 0은 올 수 없으므로 1부터 9까지는 1로 설정
        }

        // 동적 프로그래밍으로 계단 수 계산
        for (int i = 2; i <= n; i++) { // 2번째 자릿수부터 N번째 자릿수까지
            for (int j = 0; j < 10; j++) { // 각 자릿값을 0부터 9까지 탐색
                if (j == 0) {
                    dp[i][0] = dp[i - 1][1] % mod; // 현재 자릿값이 0이면, 이전 자릿값은 1만 가능
                } else if (j == 9) {
                    dp[i][9] = dp[i - 1][8] % mod; // 현재 자릿값이 9면, 이전 자릿값은 8만 가능
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod; // 그 외는 이전 자릿값이 j-1, j+1일 수 있음
                }
            }
        }

        // 결과 계산
        long ans = 0;
        for (int i = 0; i < 10; i++) {
            ans = (ans + dp[n][i]) % mod; // N자리 계단 수의 마지막 자릿값이 0부터 9까지인 모든 경우 더하기
        }

        System.out.println(ans);
    }
}
