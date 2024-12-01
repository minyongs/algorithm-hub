
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int m;
    static int n;
    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        m = Integer.parseInt(stringTokenizer.nextToken());
        n = Integer.parseInt(stringTokenizer.nextToken());

        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (arr[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        System.out.println(bfs());
    }

    static int bfs() {
        int cnt = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean changed = false;

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        queue.add(new int[]{nx, ny});
                        changed = true;
                    }
                }
            }
            if (changed) cnt++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    return -1;
                }
            }
        }

        return cnt;
    }
}
