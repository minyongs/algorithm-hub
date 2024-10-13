

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] dp = new int[n]; //i번째 숫자를 마지막으로 하는 가장 긴 증가하는 부분 수열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < n ; i++){ // 현 인덱스부터 탐색
            dp[i] = 1;
            for(int j = 0 ; j < i ; j++){ // 하나씩 탐색하며 만약 arr[j] 가 더 작으면
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i] , dp[j] + 1);//dp[j] 보다 최소 하나는 크다는 의미이므로 dp 초기화
                }
            }
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            ans = Math.max(ans , dp[i]);
        }

        System.out.println(ans);

    }
}
