
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int min = 1;
        int max = 2;   // 첫 번째 범위 [1,2)
        int cnt = 0;
        int add = 6;   // 2층부터 방의 개수가 6개

        while(true){
            if(min <= n && n < max){
                break;
            }
            min = max;
            max += add;
            add += 6;
            cnt++;
        }

        System.out.println(cnt + 1);
    }
}
