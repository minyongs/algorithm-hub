import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        // 피보나치 dp
        int[] dp0 = new int[41]; // 0 호출 횟수
        int[] dp1 = new int[41]; // 1 호출 횟수

        // 초기값 설정
        dp0[0] = 1;
        dp1[0] = 0; 
        dp0[1] = 0; 
        dp1[1] = 1; 

        
        for (int i = 2; i <= 40; i++) {
            dp0[i] = dp0[i - 1] + dp0[i - 2];
            dp1[i] = dp1[i - 1] + dp1[i - 2];
        }

        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp0[n]).append(" ").append(dp1[n]).append("\n");
        }

        System.out.println(sb);
    }
}
