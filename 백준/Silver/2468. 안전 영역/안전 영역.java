
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0 ,-1, 0};
    static int[] dy = {0, -1 ,0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        int maxHeight = 0;//입력받은 수 중 최대 높이만큼만 For문 돌기 위해
        for(int i = 0 ; i < N; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N; j++){
                map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if(map[i][j] > maxHeight){
                    maxHeight = map[i][j]; // 최대 높이 갱신
                }
            }
        }

        int max = 0;
        for(int i = 0 ; i < maxHeight + 1; i++){ //0부터 maxHeight 까지 수면의 높이를 올려가면서
            visited = new boolean[N][N];
            int cnt = 0;
            //모든 배열을 돌며 안전지역의 최대 찾기
            for(int j = 0 ; j < N; j++){
                for(int k = 0 ; k < N; k++){
                    if(!visited[j][k] && map[j][k] > i){
                        cnt += dfs(j,k,i);
                    }
                }
            }
            max = Math.max(max,cnt);
        }

        System.out.println(max);
    }

    static int dfs(int x , int y, int height){
        visited[x][y] = true;
        for(int i = 0 ; i < 4; i++){
            int nx = x +dx[i];
            int ny = y +dy[i];

            if(nx < 0 || ny < 0 || nx > N-1 || ny > N-1) continue;
            if(visited[nx][ny]) continue;
            if(map[nx][ny] > height){
                dfs(nx,ny,height);
            }
        }
        return 1;
    }
}
