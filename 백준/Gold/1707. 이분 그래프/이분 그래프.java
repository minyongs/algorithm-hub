

import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> graph;
    static int[] colors; // 0: 미방문, 1: 빨강, -1: 파랑
    static boolean isBipartite;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (T-- > 0) { // 테케를 다 돌때까지
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken()); // 정점의 개수
            int E = Integer.parseInt(st.nextToken()); // 간선의 개수

            // 그래프 초기화
            graph = new ArrayList<>();
            for (int i = 0; i <= V; i++) {
                graph.add(new ArrayList<>());
            }

            // 간선 입력
            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            // 색상 배열 초기화
            colors = new int[V + 1];
            isBipartite = true;

            // 모든 정점을 방문 (그래프가 여러 컴포넌트일 수 있음)
            for (int i = 1; i <= V; i++) {
                if (colors[i] == 0) {
                    bfs(i);
                }
            }

            // 결과 출력
            if (isBipartite) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        colors[start] = 1; // 시작 노드를 빨강으로 칠함

        while (!queue.isEmpty() && isBipartite) {
            int current = queue.poll();

            for (int num : graph.get(current)) {
                if (colors[num] == 0) { // 아직 방문하지 않은 경우
                    colors[num] = -colors[current]; // 현재 노드와 다른 색으로 칠함
                    queue.add(num);
                } else if (colors[num] == colors[current]) { // 인접한 노드가 같은 색인 경우
                    isBipartite = false;
                    return;
                }
            }
        }
    }
}
