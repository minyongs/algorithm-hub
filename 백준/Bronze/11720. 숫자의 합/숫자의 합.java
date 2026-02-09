

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //숫자의 개수
        int n = Integer.parseInt(br.readLine());
        //공백 없이 주어진 N개의 숫자
        String nums = br.readLine();
        
        //sum 선언
        long sum = 0;
        // 각 character를 돌며 바로 정수로 변환
        for(int i = 0 ; i < n; i++){
            char c = nums.charAt(i);
            int k = c - '0';
            sum += k;
        }
        System.out.println(sum);
    }
}
