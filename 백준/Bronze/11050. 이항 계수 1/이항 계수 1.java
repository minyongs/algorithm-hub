import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int num = 1;
        for(int i = n ; i>n-k;i--){
           num *= i;

        }
        int num2 = 1;

        for(int i = k; i>0; i--){
            num2 *= i;
        }
        System.out.println(num/num2);


    }
}
