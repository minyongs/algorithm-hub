import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] d = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i ++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        d[0] = a[0];

        int max = d[0];
        for(int i = 1 ; i < n; i++){
         d[i] = Math.max(d[i-1]+a[i],a[i]);
            max = Math.max(max,d[i]);
        }
        System.out.println(max);
    }
}
