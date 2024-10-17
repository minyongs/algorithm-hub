
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] triangle = new int[n][n];

        //삼각형 배열 저장
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j <= i; j++){
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j <= i; j++){
                if(j==0){ // 가장 왼쪽 인 경우
                    triangle[i][j] += triangle[i-1][j]; //바로 위에있는거 하나를 더하는 경우의 수밖에 없음
                }else if(j==i){ //가장 오른쪽인 경우
                    triangle[i][j] += triangle[i-1][j-1];//이것도 더하는 경우의 수는 하나밖에 없음
                }else{ // 중간인 경우
                    triangle[i][j] += Math.max(triangle[i-1][j],triangle[i-1][j-1]); //왼쪽 위, 오른쪽 위 두개중 큰것을 더하면 최댓값
                }
            }
        }
        int max = 0;
        for(int i = 0 ; i < n; i++){
            max = Math.max(max ,triangle[n-1][i]);//마지막 줄에서 최댓값을 찾으면 그것이 바로 최댓값
        }


        System.out.println(max);

    }
}
