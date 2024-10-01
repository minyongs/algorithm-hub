

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 이진수의 길이가 3의 배수가 아니면 앞에 0을 추가
        while (s.length() % 3 != 0) {
            s = "0" + s;
        }

        StringBuilder ans = new StringBuilder();

        // 3자리씩 끊어서 8진수로 변환
        for (int i = 0; i < s.length(); i += 3) {
            String temp = s.substring(i, i + 3);
            int num = Integer.parseInt(temp, 2); // 2진수를 10진수로 변환
            ans.append(num); // 변환한 값을 추가
        }

        System.out.println(ans.toString());
    }
}
