import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int n;
    static int[][] w;
    static boolean[] visited;
    static int minCost = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        w = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                w[i][j] = Integer.parseInt(line[j]);
            }
        }

        visited[0] = true; // 시작 도시 방문 처리
        dfs(0, 0, 0); // 시작점에서 DFS 호출
        System.out.println(minCost);
    }

    static void dfs(int depth, int current, int cost) {
        if (depth == n - 1) { // 모든 도시를 방문한 경우
            if (w[current][0] != 0) { // 시작 도시로 돌아갈 수 있는지 확인
                minCost = Math.min(minCost, cost + w[current][0]);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && w[current][i] != 0) { // 방문하지 않았고, 길이 있는 경우
                visited[i] = true;
                dfs(depth + 1, i, cost + w[current][i]); // 다음 도시로 이동
                visited[i] = false; // 백트래킹
            }
        }
    }
}
