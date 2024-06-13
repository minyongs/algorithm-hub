import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//주몽
//실버4
public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0 ;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1 ;j<n;j++ ){
                if(arr[i]+arr[j]==m){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
