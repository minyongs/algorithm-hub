

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] arr;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());  // N 값
        m = Integer.parseInt(st.nextToken());  // M 값

        nums = new int[n];  // 입력된 N개의 숫자
        arr = new int[m];  // 선택된 M개의 숫자 저장

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);  // 숫자들을 오름차순 정렬
        dfs(0, 0);
        System.out.print(sb);
    }

    private static void dfs(int depth, int start) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int prev = -1;  // 이전 값 저장
        for (int i = 0; i < n; i++) {
            if (nums[i] != prev) {  // 중복된 숫자는 스킵
                arr[depth] = nums[i];  // 현재 깊이에 숫자 저장
                dfs(depth + 1, i);  // 같은 숫자를 다시 사용할 수 있도록 i 유지
                prev = nums[i];  // 이전 값 갱신
            }
        }
    }
}
