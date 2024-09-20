import java.io.BufferedReader;
import java.io.InputStreamReader;

//1 2 3 더하기[실버3]
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dp = new int[12];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i<=11; i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }

        int n =Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n; i++){
            int index = Integer.parseInt(br.readLine());
            System.out.println(dp[index]);

        }





    }
}
