

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0 ; i < n ; i ++){
            String s = br.readLine();
            for(int j = 0 ; j < m; j++){
                maze[i][j] = s.charAt(j) - '0';
            }
        }

        int ans = bfs(0,0);
        System.out.println(ans);
    }

    private static int bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int a = current[0];
            int b = current[1];

            // 도착점에 도착시 거리 반환
            if(a == n - 1 && b == m - 1){
                return maze[a][b];
            }
            // Queue 에 새로운 위치 갱신 -> 그 위치에서의 상하좌우 돌며 visit 하지 않았고 1이면 , 거리 갱신
            for(int i = 0 ; i < 4 ; i++){
                int nx = a + dx[i];
                int ny = b + dy[i];

                if(nx >= 0 && ny >= 0 && nx < n && ny < m){
                    if(!visited[nx][ny] && maze[nx][ny] == 1){
                        visited[nx][ny] = true;
                        maze[nx][ny] = maze[a][b] + 1;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
        }
        return -1;
    }
}
