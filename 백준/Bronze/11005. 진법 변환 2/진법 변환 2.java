

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  // 변환할 수
        int a = Integer.parseInt(st.nextToken());  // 목표 진법
        
        System.out.println(convert(n, a));
    }

    private static String convert(int n, int a) {
        if (n == 0) return "0";  // n이 0일 경우 바로 0 반환

        String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        // n이 0이 아닐 때까지 반복
        while (n > 0) {
            sb.append(s.charAt(n % a));  // 나머지를 sb에 추가
            n /= a;  // n을 a로 나눈 몫으로 갱신
        }

        // 역순으로 정렬된 상태이므로 reverse 필요
        return sb.reverse().toString();
    }
}
