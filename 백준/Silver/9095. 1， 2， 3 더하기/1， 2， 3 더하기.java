
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] dp = new int[12];
    //시간 복잡도 O(T)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        //DP[N] = DP[n-3] + DP[n-2] + DP[n-1] 의 규칙성을 가짐 .. 즉 앞에 세개 더한게 다음것
        for(int i = 4 ; i <= 11; i ++){ // 11까지의 DP 배열 초기화
            dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
        }

        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}
