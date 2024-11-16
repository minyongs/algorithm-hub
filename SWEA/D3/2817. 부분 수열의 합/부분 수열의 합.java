

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] arr;
    static int n;
    static int target;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //TC 개수

        for(int i = 1 ; i <= T; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         target = Integer.parseInt(st.nextToken());
         arr = new int[n];
         st = new StringTokenizer(br.readLine());
         for(int j = 0 ; j < n ; j++){
             arr[j] = Integer.parseInt(st.nextToken());
         }
         cnt = 0;
         dfs(0,0);

            System.out.println("#" + i +" "+ cnt);
        }
    }

    private static void dfs(int idx,int sum){
        if(idx == n){
            if (sum == target){
                cnt ++;
            }
            return;
        }

        dfs(idx + 1,sum);
        dfs(idx + 1,sum + arr[idx]);
    }
}

//1 1 2 3
//1:10 시작