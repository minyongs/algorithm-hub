

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int ans = Integer.MAX_VALUE;
        String s = bufferedReader.readLine();
        int n = s.length();

        // SubString 으로 문자열 자르기 -> 2부터 n까지
        for(int i = 0; i <= n; i++){
            String word = s.substring(i,n);
            if(isPalindrom(word)){
                ans = Math.min(ans,n + i);
            }
        }

        System.out.println(ans);
    }

    public static boolean isPalindrom(String s){
        StringBuilder sb = new StringBuilder(s);
        String flipped = sb.reverse().toString();
        return s.equals(flipped);
    }
}
