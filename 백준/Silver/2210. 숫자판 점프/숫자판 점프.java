

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0,-1, 1};
    static Set<String> nums = new HashSet<>();
    static int[][] board = new int[5][5];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<5; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5; j++){
                dfs(i,j,"");
            }
        }
        System.out.println(nums.size());
    }

    private  static void dfs(int x , int y,String number){
        if(number.length() == 6){
            nums.add(number);
            return;
        }


        for(int i = 0 ; i < 4 ; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                dfs(nx, ny, number + board[nx][ny]);
            }
        }
    }
}
