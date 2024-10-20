
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // n이 홀수인 경우는 타일로 채울 수 없음
        if (n % 2 == 1) {
            System.out.println(0);
            return;  // 프로그램 종료
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;  // 기본 초기화: 3x0 크기는 1가지 경우

        for (int i = 2; i <= n; i += 2) {
            dp[i] = 3 * dp[i - 2];  // 기본 패턴

            // 비대칭 패턴 
            for (int j = i - 4; j >= 0; j -= 2) {
                dp[i] += 2 * dp[j];
            }
        }

        System.out.println(dp[n]);
    }
}
