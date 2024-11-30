import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int cnt =0;
        for(int i = 0 ; i < n; i++){
            arr[i] =Integer.parseInt(st.nextToken());
            if(isSosu(arr[i])){
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    public static boolean isSosu(int n) {
        if(n == 1){
            return false;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
