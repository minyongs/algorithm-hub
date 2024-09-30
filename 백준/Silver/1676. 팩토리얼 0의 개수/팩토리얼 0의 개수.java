import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(br.readLine());
        int count = 0;
        // 0의 개수는 5의 배수가 결정함! 

        while (num >= 5) {
            count += num / 5; //CNT 증가
            num /= 5; // 나눠진 숫자도 5가 들어가 있는지 확인 필요
        }
        System.out.println(count);
    }
}



