

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = String.valueOf(n);
        int target = make(n,s);
        int ans = 0;
        for(int i = s.length() ; i >= 1; i--){
            ans += (n - target + 1) * i;
            n = target - 1;
            target /= 10;
        }

        System.out.println(ans);
    }

    //8243

    private static int make(int n,String s){
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        while (sb.length() != s.length()){
            sb.append(0);
        }
        return Integer.parseInt(sb.toString());
    }
}
