import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//덩치
//실버5
public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] arr = new String[s.length()];
        for(int i=0;i<s.length();i++){
            String sub = s.substring(i,s.length());
            arr[i] = sub;
        }

        Arrays.sort(arr);
        
        for(String ans : arr){
            System.out.println(ans);
        }

    }
}
