

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 2];//마지막 날까지 얻을수 있는 최대 수익
        int[] day = new int[n + 1];
        int[] price = new int[n + 1];


        for(int i = 1 ; i  <= n ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            day[i] = Integer.parseInt(st.nextToken());
            price[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = n; i > 0; i--){ //역순으로
            if(i+day[i] <= n+1){ // 퇴사일을 넘지 않으면
                dp[i] = Math.max(price[i] + dp[i+day[i]],dp[i+1]); //i 일의 가격 + 그 작업이 끝나는 날에 최대로 받을수 있는 가격의 합
            }else{
                dp[i] = dp[i+1];
            }
        }

        System.out.println(dp[1]);//첫날의 dp가 최댓값

    }
}
