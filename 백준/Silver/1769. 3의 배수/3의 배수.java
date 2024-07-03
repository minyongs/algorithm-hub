import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int length = s.length();

        int cnt = 0;

        while(length != 1){
            int n = 0;
            for(int i = 0 ; i < length; i++){
                n += s.charAt(i) - '0';
            }
            length = String.valueOf(n).length();
            s = String.valueOf(n);
            cnt++;

        }
        int ans = Integer.parseInt(s);
        String three =  ans% 3==0 ? "YES":"NO";
        System.out.println(cnt);
        System.out.println(three);

    }
}
