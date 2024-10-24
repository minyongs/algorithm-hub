

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim()); // 테스트 케이스 수 입력

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine().trim()); // 농장 크기 입력

            int idx = (n - 1) / 2;
            int cnt = 0;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                String s = br.readLine(); // 각 행의 문자열 입력
                if (i < idx) {
                    for (int j = idx - cnt; j <= idx + cnt; j++) {
                        sum += s.charAt(j) - '0'; // 문자열의 특정 부분 합산
                    }
                    cnt++;
                }else if(cnt == i){
                    for(int j = 0;j<s.length();j++){
                        sum += s.charAt(j)-'0';
                    }
                }
                else{
                    cnt--;
                    for (int j = idx - cnt; j <= idx + cnt; j++) {
                        sum += s.charAt(j) - '0'; // 문자열의 특정 부분 합산
                    }
                }
            }

            System.out.println("#" + test_case + " " + sum); // 결과 출력
        }
    }
}
