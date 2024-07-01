import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String s = br.readLine();

            StringBuilder sb = new StringBuilder(s);
            StringBuilder sb2 = new StringBuilder();
            String reversed =sb.reverse().toString();

            String[] arr = reversed.split(" ");

            for(int j = arr.length-1;j >=0; j--){
                sb2.append(arr[j]);
                sb2.append(" ");
            }

            String ans = sb2.toString().trim();
            System.out.println(ans);

        }



    }

}
