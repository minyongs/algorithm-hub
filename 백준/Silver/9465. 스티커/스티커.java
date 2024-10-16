
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in);

        //idea => 전에 등장했던 DP 중 인접하지 않은 DP값들을 더해가며 최댓값을 구한다 !
        for(int i = 0 ; i < T ; i++){
            int n = Integer.parseInt(br.readLine());
            int [][] stickers = new int[2][n];
            for(int j = 0 ; j < 2; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k = 0; k < n; k++){
                    stickers[j][k] =Integer.parseInt(st.nextToken());
                }
            }
            // 열이 1개인 경우 예외 처리
            if (n == 1) {
                System.out.println(Math.max(stickers[0][0], stickers[1][0]));
                continue; 
            }

            int[][] dp = new int[2][n];
            //첫번째 열
            dp[0][0] = stickers[0][0];
            dp[1][0] = stickers[1][0];
            //두번째 열
            dp[0][1] = stickers[0][1] + dp[1][0];
            dp[1][1] = stickers[1][1] + dp[0][0];

            for(int l = 2; l < n ; l++){
                dp[0][l] = Math.max(dp[1][l - 1],dp[1][l - 2]) + stickers[0][l]; //전에 나온 dp 중 인접한 dp 다 제외시킨 두 값중 큰것 + 현 스티커 가격
                dp[1][l] = Math.max(dp[0][l - 1],dp[0][l - 2]) + stickers[1][l];
            }

            System.out.println(Math.max(dp[0][n-1],dp[1][n-1]));
        }
        sc.close();

    }
}
