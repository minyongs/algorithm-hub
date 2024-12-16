

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] already = new int[k];
        long max = 0;
        for(int i = 0 ; i < k; i++){
            int a = Integer.parseInt(br.readLine());
            already[i] = a;

            if(already[i] > max){
                max = already[i] ;
            }
        }
        
        long start = 1;
        long end = max;
        long result = 0;
        
        while (start <= end){
            long mid = (start + end) / 2;
            long sum = 0;
            
            for(int i : already){
                sum += i / mid;
            }
            
            if(sum >= n){
                result = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(result);

    }
}
