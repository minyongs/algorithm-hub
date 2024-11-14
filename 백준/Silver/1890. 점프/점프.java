

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        long[][] dp = new long[n][n]; // 0 0 에서 i j 로 도달할 수 있는 수

        for( int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for( int j = 0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = 1;

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                if(dp[i][j] == 0 || (i == n-1 && j == n - 1))continue; // 도달 불가능하거나, 도착 지점이면 PASS
                int jump = board[i][j];
                // 아래로 이동 가능한 경우 DP 갱신
                if(i + jump < n) dp[i + jump][j] += dp[i][j];
                // 오른쪽으로 이동 가능한 경우 DP 갱신
                if(j + jump < n) dp[i][j + jump] += dp[i][j];
            }
        }
        System.out.println(dp[n-1][n-1]);
    }
}
