
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//이중 For문으로 모든 경우의 수를 돌기 때문에 O(n^2)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int[] dp = new int[n];
        Arrays.fill(dp, 1); 

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int max = 1; 

        for (int i = 1; i < n; i++) { 
            for (int j = 0; j < i; j++) { 
                if (nums[i] < nums[j]) { //증가하는 부분수열과 다른 부분 (이전 숫자가 더 작으면 갱신 -> 더 크면 갱신)
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]); // 최대 길이 갱신
        }

        System.out.println(max);
    }
}
