

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 1 ; i <= T ; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); //손님 수
            int m = Integer.parseInt(st.nextToken()); //붕어빵을 만드는데 걸리는 시간
            int k = Integer.parseInt(st.nextToken()); //m 시간마다 만드는 붕어빵의 갯수

            int[] arr = new int[n]; //손님이 몇초에 도착하는지를 저장한 배열

            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            int cnt = 0;
            String ans = "Possible";
            for(int j = 0 ; j < n; j++){
                int t = arr[j];
                if(t == 0){
                    ans ="Impossible";
                }
                cnt = (t / m) * k - j;//현재까지 만든 붕어빵 개수 - 손님 수

                if(cnt<=0){
                    ans = "Impossible";
                    break;
                }
            }

            System.out.println("#"+i+" "+ans);

        }
    }
}
//2초마다 하나씩 만들수 있음
//2초 3초에 옴
//0 0 1