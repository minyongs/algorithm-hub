

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    static int[][] arr;
    static boolean[] team;
    static int minDiff =Integer.MAX_VALUE;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        team = new boolean[n];

        // 능력치 행렬 입력 받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backtrack(0,0);
        System.out.println(minDiff);


    }

    private static void backtrack(int start,int cnt){
        if (cnt == n / 2) {  // 팀이 반으로 나뉘어졌을 때
            calculate();
            return;
        }



        for(int i = start; i < n; i++){
            if(!team[i]){
                team[i] = true;
                backtrack(i+1,cnt + 1);
                team[i] = false;
            }
        }
    }

    private static void calculate(){
        int start = 0;
        int link = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1; j < n; j++){
                if(team[i] && team[j]){
                    start += arr[i][j] + arr[j][i];
                }else if(!team[i] && !team[j]){
                    link += arr[i][j] + arr[j][i];
                }
            }
        }
        minDiff = Math.min(minDiff,Math.abs(start-link));
    }
}
