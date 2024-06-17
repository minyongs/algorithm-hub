import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i <n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int ans =0 ;


        for(int i = 0 ; i < n ;i++){
            for(int j = i+1; j<n;j++){
                for(int k = j+1;k<n;k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum >m){
                        continue;
                    }
                    int dif = m -(sum);
                    min = Math.min(min,dif);
                    if(dif == min){
                        ans =(sum);
                    }
                }
            }
        }
        System.out.println(ans);


    }
}
