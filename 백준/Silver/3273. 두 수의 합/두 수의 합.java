

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int find = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int ans = 0;
        int start = 0;
        int end = n - 1;

        while(start < end){
            int sum = arr[start] + arr[end];

            if(sum == find){
                ans ++;
                start++;
                end--;
            }else if(sum < find){
                start++;
            }else{
                end --;
            }
        }

        System.out.println(ans);

    }
}
