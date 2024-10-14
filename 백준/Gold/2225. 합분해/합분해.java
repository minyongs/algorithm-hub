
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int MOD = 1000000000;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // dp[i][j]: i개의 숫자로 j를 만드는 경우의 수
        int[][] dp = new int[K + 1][N + 1];

        for (int i = 0; i <= N; i++) { // 1개의 숫자로 만드는 방법은 오직 1
            dp[1][i] = 1;
        }

        for (int i = 2; i <= K; i++) { //2개의 숫자부터 K개의 숫자까지 N을 만들수 있는 경우의 수를 구하기 시작
            for (int j = 0; j <= N; j++) {
                dp[i][j] = dp[i - 1][j]; // i-1개의 숫자로 j를 만드는 방법
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i][j - 1]) % MOD; // i개의 숫자로 j-1을 만드는 방법 추가
                }
            }
        }

        System.out.println(dp[K][N]);

    }
}
/*
i = 2일 때:

dp[2][0] = dp[1][0] = 1 (2개의 숫자로 0을 만드는 방법은 1가지)
dp[2][1] = dp[1][1] + dp[2][0] = 1 + 1 = 2
dp[2][2] = dp[1][2] + dp[2][1] = 1 + 2 = 3
dp[2][3] = dp[1][3] + dp[2][2] = 1 + 3 = 4
dp[2][4] = dp[1][4] + dp[2][3] = 1 + 4 = 5
i = 3일 때:

dp[3][0] = dp[2][0] = 1
dp[3][1] = dp[2][1] + dp[3][0] = 2 + 1 = 3
dp[3][2] = dp[2][2] + dp[3][1] = 3 + 3 = 6
dp[3][3] = dp[2][3] + dp[3][2] = 4 + 6 = 10
dp[3][4] = dp[2][4] + dp[3][3] = 5 + 10 = 15
 */