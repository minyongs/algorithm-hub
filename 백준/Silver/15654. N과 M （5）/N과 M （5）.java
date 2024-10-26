

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();  // 출력 결과를 저장할 StringBuilder
    static int n, m;  // n: 최대 숫자, m: 고를 숫자의 개수
    static boolean[] visit;  // 방문 여부를 체크할 배열
    static int[] arr;  // 선택한 숫자를 저장할 배열
    static int[] nums;  // 입력받은 숫자들을 저장할 배열

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());  // N 값
        m = Integer.parseInt(st.nextToken());  // M 값

        // 배열 초기화
        nums = new int[n];  // N개의 숫자를 저장할 배열
        arr = new int[m];  // M개의 선택된 숫자를 저장할 배열
        visit = new boolean[n];  // 방문 여부를 체크할 배열


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(nums);


        dfs(0);
        System.out.print(sb);
    }

    private static void dfs(int depth) {
        // M개의 숫자를 모두 선택한 경우
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 정렬된 배열을 순회하며 숫자 선택
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {  // 아직 방문하지 않은 숫자만 선택
                visit[i] = true;  // 방문 체크
                arr[depth] = nums[i];  // 선택한 숫자를 현재 깊이에 저장
                dfs(depth + 1);  // 다음 깊이로 이동

                // 백트래킹 (방문 해제)
                visit[i] = false;
            }
        }
    }
}
