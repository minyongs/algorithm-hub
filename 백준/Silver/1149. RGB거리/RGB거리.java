
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int MOD = 1000000000;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        /*
        dp[i][0]: i번째 집을 빨강으로 칠했을 때의 최소 비용.
        dp[i][1]: i번째 집을 초록으로 칠했을 때의 최소 비용.
        dp[i][2]: i번째 집을 파랑으로 칠했을 때의 최소 비용.
         */
        int[][] dp = new int[n + 1][3]; // 각 집을 R G B 중 한가지 색으로 칠할 때의 누적 최소 비용
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            //모든 색깔로 칠했을 때의 누적 값을 dp 배열에 갱신
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + r; //빨간색으로 칠할 때
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + g; //초록색으로 칠할 때
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + b; //파란색으로 칠할 때
        }

        System.out.println(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2]))); // 다 칠했으면 최종 누적 합 중에서 최소값 구하기 
    }
}
