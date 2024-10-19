import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[][] arr = new int[101][101];
            //각 직사각형의 X, Y 좌표 등록
            for(int i = 0; i<4; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                int leftX = Integer.parseInt(st.nextToken());
                int leftY = Integer.parseInt(st.nextToken());
                int rightX = Integer.parseInt(st.nextToken());
                int rightY = Integer.parseInt(st.nextToken());

                //직사각형의 넓이만큼 1 로 설정(중복된 값도 어짜피 1이기 때문에 고려할 필요X)
                for(int j = leftX; j<rightX;j++){
                    for(int k = leftY;k<rightY;k++){
                        arr[j][k] = 1 ;
                    }
                }


            }
            // 1만 카운트
            int cnt =0;
            for(int i =0 ; i<101;i++){
                for(int j = 0 ; j<101;j++){
                    if(arr[i][j] == 1){
                        cnt++;
                    }
                }
            }


        System.out.println(cnt);


    }
}
