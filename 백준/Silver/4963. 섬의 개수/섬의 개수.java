

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int w, h;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            w = Integer.parseInt(stringTokenizer.nextToken()); // 클래스 변수에 할당
            h = Integer.parseInt(stringTokenizer.nextToken()); // 클래스 변수에 할당

            if (h == 0 && w == 0) {
                break;
            }

            map = new int[h][w];
            visited = new boolean[h][w];

            // 지도 정보 입력
            for (int i = 0; i < h; i++) {
                stringTokenizer = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }

            int cnt = 0; // 섬의 개수
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }


    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];


            if (nx >= 0 && ny >= 0 && nx < h && ny < w && !visited[nx][ny] && map[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}
