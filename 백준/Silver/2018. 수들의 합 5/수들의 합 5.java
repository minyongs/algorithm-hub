
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0; // 출력할 변수 -> N과 일치할때마다 1씩 증가
        int N = Integer.parseInt(br.readLine());


        for(int i = 1; i < N; i++){
            int sum = 0;
            int firstNum = i;
            while(!(sum >= N)){
                sum += firstNum;
                firstNum++;
                if(sum == N) ans++;
            }
        }
        System.out.println(ans + 1);

    }
}
