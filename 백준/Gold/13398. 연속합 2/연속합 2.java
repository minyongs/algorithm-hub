
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[][] dp = new int[n][2];


        dp[0][0] = arr[0]; // 아무것도 삭제하지 않은 경우
        dp[0][1] = 0;      // 첫 번째 원소를 삭제한 경우

        int ans = arr[0]; 

        
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0] + arr[i], arr[i]); // 삭제 없이 연속합
            dp[i][1] = Math.max(dp[i - 1][1] + arr[i], dp[i - 1][0]); // 삭제한 dp , 삭제안한 dp 둘중 더 큰것으로 초기화

            // 최대값 갱신
            ans = Math.max(ans, Math.max(dp[i][0], dp[i][1]));
        }

        
        System.out.println(ans);
    }
}