import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int[][] board;
    public static boolean[][] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        board = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }
        int cnt = 0 ;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){

                if(board[i][j] == 1 && !visited[i][j]){
                    cnt++;

                    int x =dfs(i,j);
                    list.add(x);
                }

            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for(int i : list){
            System.out.println(i);
        }


    }

    public static int dfs(int x, int y){
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};

        visited[x][y] = true;
        int cnt =1 ;
        for(int i = 0 ; i < 4; i++){
            int xn = x + dx[i];
            int yn = y + dy[i];

            if((xn> -1&& xn<n)&&(yn> -1 && yn<n)&&board[xn][yn]==1&&!visited[xn][yn]){

                cnt += dfs(xn,yn);
            }
        }
        return cnt;


    }

}
