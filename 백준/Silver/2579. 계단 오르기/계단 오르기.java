import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int[] dp;
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        dp = new int[n+1];
        for(int i = 1 ; i <= n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = arr[1];
        if(n>=2){
            dp[2] = arr[1] + arr[2];
        }
        for(int i = 3; i <= n ; i++){
            dp[i] = Math.max(dp[i-2],dp[i-3]+arr[i-1])+arr[i];//dp[i-2] 에서 두계단 뛰어오는 경우와 전에 이미 두계단 뛰어와 연달이 뛰는 경우중 더 큰것 계산
        }

        System.out.println(dp[n]);

    }
}