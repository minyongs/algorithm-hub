
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] wine = new int[n+1];
        int[] dp = new int[n+1];
        for(int i = 1 ; i <= n ; i++){
            wine[i] = Integer.parseInt(br.readLine());
        }
        
        if (n == 1) {
            System.out.println(wine[1]);
            return;
        }

        dp[1] = wine[1];
        dp[2] = wine[1] + wine[2];


        for(int i = 3 ; i <= n; i++){
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + wine[i], dp[i-3] + wine[i-1] + wine[i]));// i번째를 그냥 안마실때 , i-1 번째를 안마시고 i-2번째를 마실때 , i번째와 i-1 번째를 마실때 비교
        }

        System.out.println(dp[n ]);

    }
}
