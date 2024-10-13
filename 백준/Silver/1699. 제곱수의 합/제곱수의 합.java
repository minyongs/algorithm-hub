

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());


        int[] dp = new int[n + 1];

        
        for (int i = 1; i <= n; i++) {
            dp[i] = i; // 최악의 경우: 모두 1^2의 합으로 구성
        }


        // i: 1부터 n까지 숫자를 제곱수의 합으로 나타내는 최소 개수를 구함
        for (int i = 1; i <= n; i++) {
            // j * j <= i인 모든 제곱수 j에 대해 확인
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        // 결과 출력: dp[n]은 n을 제곱수의 합으로 나타내는 최소 개수
        System.out.println(dp[n]);
    }
}
