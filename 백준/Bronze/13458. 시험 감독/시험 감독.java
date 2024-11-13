

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 시험장 개수
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 시험장 응시자 수
        }
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken()); // 총감독관이 감독할 수 있는 인원
        int c = Integer.parseInt(st.nextToken()); // 부감독관이 감독할 수 있는 인원

        long cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt++; 
            int remaining = arr[i] - b; 

            if (remaining > 0) {
                cnt += remaining / c; 
                if (remaining % c != 0) { 
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
