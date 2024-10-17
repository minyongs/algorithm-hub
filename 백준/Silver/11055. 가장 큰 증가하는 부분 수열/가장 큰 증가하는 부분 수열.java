
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n+1]; //현재 수가 가질수 있는 합중 가장 큰 값
        dp[1] = nums[1];

        int max = dp[1];
        for(int i = 2 ; i <= n ; i++){
            dp[i] = nums[i];
            for(int j = 1; j < i; j++){
                if(nums[j]<nums[i]){ //자신보다 작은 수가 나왔을때 
                    dp[i] = Math.max(dp[i] , nums[i] + dp[j] ); //dp 값 갱신
                }
            }
            max = Math.max(max,dp[i]);
        }

        System.out.println(max);
    }
}
