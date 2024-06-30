import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n];

        dfs(n,m,0);

    }
    public static void dfs(int N, int M, int depth) {
        // 종료 조건: depth가 M과 같으면, arr 배열 출력
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        // N개의 숫자를 순회
        for (int i = 0; i < N; i++) { // 3 1
            // 현재 숫자 i가 아직 선택되지 않았으면
            if (!visit[i]) {
                visit[i] = true; // 숫자 i를 선택했음을 표시
                arr[depth] = i + 1; // arr 배열의 현재 깊이에 숫자 저장 (i+1로 저장, 숫자는 1부터 시작)
                dfs(N, M, depth + 1); // 다음 깊이로 이동하여 DFS 재귀 호출
                visit[i] = false; // 숫자 i 선택 해제 (다른 경로에서 사용할 수 있도록)
            }
        }
    }

}
