

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int devided;
    static boolean[][] visited;
    static int[] dx = {1 , 0 , -1, 0};
    static int[] dy = {0 , -1 , 0, 1};
    static int M;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
         M = Integer.parseInt(stringTokenizer.nextToken());
         N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        arr = new int[M][N];
        visited = new boolean[M][N];

        for(int i = 0 ; i < K; i++) { //직사각형 그리기
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            int d = Integer.parseInt(stringTokenizer.nextToken());

            for (int i1 = M - d; i1 < M - b; i1++) { // y축 기준 뒤집기
                for (int j = a; j < c; j++) { // x축은 그대로
                    arr[i1][j] = 1;
                }
            }
        }
        ArrayList<Integer> areas = new ArrayList<>();
        for(int i1 = 0 ; i1 < M; i1++){
            for(int j = 0 ; j < N; j++){
                if(!visited[i1][j] && arr[i1][j] == 0){
                    areas.add(dfs(i1,j));
                }
            }
        }

        Collections.sort(areas);
        System.out.println(areas.size());
        for(int i1 : areas){
            System.out.print(i1+" ");
        }

    }

    private static int dfs(int x,int y){
        visited[x][y] = true;
        int size = 1;
        for(int i = 0 ; i < 4; i++){
            int nx = x +dx[i];
            int ny = y +dy[i];

            if(nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
            if(visited[nx][ny] || arr[nx][ny] == 1) continue;
            size += dfs(nx,ny);
        }

        return size;
    }
}

