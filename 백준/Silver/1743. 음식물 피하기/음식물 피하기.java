import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int n,m,k;
    public static int[][] field;
    public static boolean[][] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        field = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0 ; i < k; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            field[a][b] = 1 ;

        }
        List<Integer> size = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(field[i][j] ==1 && !visited[i][j]){
                    size.add(dfs(i,j));
                }
            }
        }

        size.sort(Collections.reverseOrder());
        System.out.println(size.get(0));

    }

    public static int dfs(int x,int y){
        int[] dx ={0,0,-1,1};
        int[] dy ={-1,1,0,0};

        visited[x][y] = true;
        int cnt = 1;
        for(int i = 0 ; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if((nx > -1 && nx<n)&&(ny > -1 && ny < m)&&field[nx][ny] ==1 && !visited[nx][ny]){
                cnt += dfs(nx,ny);
            }
        }
        return cnt;
    }
}
