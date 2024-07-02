import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int[][] bingo = new int[5][5];
       boolean[][] arr = new boolean[5][5];
        for(int i = 0 ; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j <5;j++){
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
       }
        int cnt = 0 ;
        boolean bingoComplete =false;
        for(int i = 0 ; i < 5; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 5; j++){
                int n = Integer.parseInt(st2.nextToken());
                cnt++;


                for(int i2 =  0; i2 <5;i2++){
                    for(int j2 = 0 ; j2<5; j2++){
                        if(bingo[i2][j2] == n){
                            arr[i2][j2] = true;
                        }
                        if(bingoCheck(arr)>=3){
                            bingoComplete = true;
                            break;
                        }
                    }
                    if(bingoComplete)
                        break;
                }
                if(bingoComplete) break;
            }
            if(bingoComplete) break;
        }


        System.out.println(cnt);



    }

    public static int bingoCheck(boolean[][] arr){//수가 채워졌으면 true , 안채워졌으면 false
        int cnt = 0;
        for(int i = 0 ; i < 5;i++){
            boolean check = true;
            for(int j = 0 ; j < 5; j++){
                if(!arr[i][j]){
                    check= false;
                }
            }
            if(check){
                cnt++;
            }
        }
        for(int j = 0; j < 5; j++){
            boolean check = true;
            for(int i = 0; i < 5; i++){
                if(!arr[i][j]){
                    check = false;
                    break;
                }
            }
            if(check) cnt++;
        }
        if(arr[0][0] && arr[1][1] && arr[2][2] && arr[3][3] && arr[4][4]){
            cnt++;
        }
        if(arr[0][4]&&arr[1][3]&&arr[2][2]&&arr[3][1]&arr[4][0]){
            cnt++;
        }

        return cnt;
    }
}
