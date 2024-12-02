

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int n, m;
    static char[][] board;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean hasCycle = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        n = Integer.parseInt(size[0]);
        m = Integer.parseInt(size[1]);

        board = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, -1, -1, board[i][j]);
                    if (hasCycle) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }

        System.out.println("No");
    }

    static void dfs(int x, int y, int px, int py, char c) {
        if (hasCycle) return;
        visited[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue; // 범위 안에 있을때만
            if (board[nx][ny] != c) continue;

            if (visited[nx][ny]) { // 이미 방문했는데 맨 처음 방문한게 아닐때
                if (nx != px || ny != py) {
                    hasCycle = true;
                    return;
                }
            } else {
                dfs(nx, ny, x, y, c);
            }
        }
    }
}
