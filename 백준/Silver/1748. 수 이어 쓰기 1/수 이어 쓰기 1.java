

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int ans = 0;
        int digit = 1; // 더할 자릿수
        int range = 10; //검사중인 범위
        for(int i = 1; i <= n; i++){
            if(i % range == 0){ //range 로 나누어떨어지면 자릿수가 바뀌었단 의미
                digit ++; // 더해주는 자릿수도 바꿔줘야함
                range *= 10; //10을 곱한 자릿수로 !
            }
            ans += digit; //계속더해
        }

        System.out.println(ans);

    }
}
