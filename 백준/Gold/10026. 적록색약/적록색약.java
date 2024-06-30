import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int n;
    public static int[][] field;
    public static int[][] field2;
    public static boolean[][] visited;
    public static boolean[][] visited2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        field = new int[n][n];
        field2 = new int[n][n];
        visited = new boolean[n][n];
        visited2 = new boolean[n][n];

        StringTokenizer st;
        for(int i = 0 ; i < n ; i++){
            String s = br.readLine();
            for(int j = 0 ; j < n; j++){
                field[i][j] = s.charAt(j);
                if(s.charAt(j) == 'G'){
                    field2[i][j] = 'R';
                }else{
                    field2[i][j] = s.charAt(j);
                }
            }
        }
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(!visited[i][j] ){
                    cnt++;
                    dfs(i,j);
                }
            }
        }
        int cnt2 = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(!visited2[i][j] ){
                    cnt2++;
                    dfs2(i,j);
                }
            }
        }
        System.out.println(cnt+" "+cnt2);
        





    }

    public static void dfs(int x,int y){
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};

        visited[x][y] =true;

        for(int i = 0 ; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if((nx> -1 && nx<n)&&(ny> -1 && ny< n)&&field[nx][ny]==field[x][y]&&!visited[nx][ny]){
                    dfs(nx,ny);
            }

        }
    }
    public static void dfs2(int x,int y){
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};

        visited2[x][y] =true;

        for(int i = 0 ; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if((nx> -1 && nx<n)&&(ny> -1 && ny< n)&&field2[nx][ny]==field2[x][y]&&!visited2[nx][ny]){
                dfs2(nx,ny);
            }

        }
    }
}
