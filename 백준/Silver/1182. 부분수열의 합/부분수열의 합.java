

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static int n;
    static int cnt;
    static int target;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //입력되는 숫자의 개수
        target = Integer.parseInt(st.nextToken()); //합해서 나와야 하는 값

        arr = new int[n]; // 배열 초기화

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); 
        }

        cnt = 0;
        backtrack(0,0);
        if(target == 0){ //공집합 제외
            cnt --;
        }
        System.out.println(cnt);
    }


    private static void backtrack(int idx, int currentSum) {
        if (idx == n) {
            if (currentSum == target) cnt++; // 부분 수열의 합이 target과 같다면 카운트 증가
            return;
        }

        // 현재 요소를 포함하지 않는 경우
        backtrack(idx + 1, currentSum);

        // 현재 요소를 포함하는 경우
        backtrack(idx + 1, currentSum + arr[idx]);
    }
}
