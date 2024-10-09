

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[n+1];
        int[] cardPrices = new int[n+1];

        for(int i = 1; i <= n; i++){
            cardPrices[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {//1장씩 i번 샀을때 , 1장씩 1번사고 나머지를 i에맞춰샀을때 , .......
                dp[i] = Math.max(dp[i], dp[i-j] + cardPrices[j]);
            }
        }

        System.out.println(dp[n]);

    }
}
