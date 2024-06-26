import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int m;
    public static int n;
    public static int k;
    public static int[][] farm;
    public static boolean[][] visited;
    public static int T;


    public static void main(String[] args) throws Exception {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());


        StringTokenizer st ;
        for(int i = 0 ; i < T; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            farm = new int[m][n];
            visited = new boolean[m][n];


            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[x][y] = 1;
            }
            int cnt = 0;
            for (int x = 0; x < m; x++) {
                for (int y = 0; y < n; y++) {
                    if (farm[x][y] == 1 && !visited[x][y]) {
                        cnt++;

                        dfs(x, y);
                    }

                }
            }
            System.out.println(cnt);
        }


    }

    public static void dfs(int x,int y){
        int[] dx ={0,0,-1,1};
        int[] dy ={-1,1,0,0};

        visited[x][y]=true;

        for(int i = 0 ; i < 4; i++){
            int xn = x + dx[i];
            int yn = y + dy[i];

            if((xn>-1 && xn <m) &&(yn> -1&&yn<n)&&farm[xn][yn] == 1 && !visited[xn][yn]){
                dfs(xn,yn);
            }
        }




    }
}
