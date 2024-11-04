

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //TC 개수

        for(int i = 1 ; i <= T; i++){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            int cnt = 0;
            cnt+=arr[0] * 2 + 1;
            for(int j = 1 ; j < n; j++){
                if(arr[j] == arr[j-1]){
                    cnt += arr[j] + 1;
                }else{
                    cnt+= (arr[j] * 2 +1) - arr[j-1];
                }
            }


            System.out.println("#" + i +" "+cnt);
        }
    }
}
//2 2 3
//ㅇㅇㅁㅇㅇ ㅁㅇㅇ ㅇㅁㅇㅇㅇ