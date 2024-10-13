

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] dp = new int[n]; //i번째 숫자를 마지막으로 하는 가장 긴 증가하는 부분 수열
        int[] trace = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            trace[i] = -1; // 처음에는 이전 요소 없음
        }

        for(int i = 0 ; i < n ; i++){ // 현 인덱스부터 탐색
            dp[i] = 1;
            for(int j = 0 ; j < i ; j++){ // 하나씩 탐색하며 만약 arr[j] 가 더 작으면
                if(arr[j] < arr[i] && dp[i] < dp[j] + 1){ // dp가 갱신될 때만 조건 추가 !!
                    dp[i] = Math.max(dp[i] , dp[j] + 1);//dp[j] 보다 최소 하나는 크다는 의미이므로 dp 초기화
                    trace[i] = j; //어디서 왔는지 저장
                }
            }
        }
        int ans = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > ans) {
                ans = dp[i];
                index = i;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (index != -1){
            list.add(0,arr[index]); // 역순 저장
            index = trace[index]; //dp의 마지막 인덱스 부터 시작해서 추적배열의 인덱스를 계속 타고 수열을 저장
        }

        System.out.println(ans);
        for(int ans2 : list){
            System.out.print(ans2 + " ");
        }

    }
}
