

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 집의 수

        int[][] cost = new int[n + 1][3]; // 각 집의 색깔별 비용

        // 비용 입력 받기
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken()); // 빨강 비용
            cost[i][1] = Integer.parseInt(st.nextToken()); // 초록 비용
            cost[i][2] = Integer.parseInt(st.nextToken()); // 파랑 비용
        }

        int min = Integer.MAX_VALUE; // 최종 최소 비용

        // 첫 번째 집의 색깔을 3가지로 각각 고정
        for (int first = 0; first < 3; first++) {
            int[][] dp = new int[n + 1][3]; // DP 배열

            // 첫 번째 집의 색을 고정하고 나머지는 큰 값으로 초기화
            for (int i = 0; i < 3; i++) {
                dp[1][i] = (i == first) ? cost[1][i] : 1000000;
            }

            // 두 번째 집부터 마지막 집까지 누적 비용 계산
            for (int i = 2; i <= n; i++) {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0]; // R
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1]; // G
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2]; // B
            }

            // 첫 번째 집과 마지막 집의 색이 다른 경우만 
            for (int last = 0; last < 3; last++) {
                if (first != last) {
                    min = Math.min(min, dp[n][last]);
                }
            }
        }

        
        System.out.println(min);
    }
}
