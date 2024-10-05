

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        int a = Integer.parseInt(st.nextToken());

        System.out.println(convert(s,a));
    }

    private static int convert(String s,int a){
        String temp = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int result = 0;
        int pow = 1;

        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            int val = temp.indexOf(c);

            result += val * pow;
            pow *= a;
        }
        return result;
    }
}
