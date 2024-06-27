import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int m,n,k;
    public static int[][] paper;
    public static boolean[][] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        paper = new int[m][n];
        visited = new boolean[m][n];

        for(int i = 0 ; i < k; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            for(int j = b; j<d; j++) {
                for (int l = a; l < c; l++) {
                        paper[j][l] = 1;
                }
            }

        }
        int territories=0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(paper[i][j] == 0 && !visited[i][j]){
                    territories++;
                    list.add(dfs(i,j));
                }
            }
        }

        Collections.sort(list);

        System.out.println(territories);
       for(int i : list){
           System.out.print(i+" ");
       }


    }

    public static int dfs(int x, int y ){
        int[] dx ={0,0,-1,1};
        int[] dy ={-1,1,0,0};
        visited[x][y] = true;
        int cnt = 1;
        for(int i = 0 ; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if ((nx >= 0 && nx < m) && (ny >= 0 && ny < n) && paper[nx][ny] == 0 && !visited[nx][ny]) {
                cnt += dfs(nx, ny);
            }
        }
        return cnt;
    }
}
