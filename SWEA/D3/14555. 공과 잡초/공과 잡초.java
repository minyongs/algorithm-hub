

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //TC 개수

        for(int i = 1 ; i <= T; i++){
            int cnt = 0;
            String s = br.readLine();
            if(s.charAt(0)=='(' || s.charAt(0) == ')'){
                cnt++;
            }
            for(int j = 1 ; j < s.length();j++){
//                if((s.charAt(j-1)!='(' ||s.charAt(j-1)!=')') && (s.charAt(j) == '('|| s.charAt(j)==')')){
//                    cnt++;
                if(s.charAt(j)=='(' || s.charAt(j) == ')'){
                    cnt++;
                }
                if(s.charAt(j-1)=='(' && s.charAt(j)==')'){
                    cnt--;
                }
            }
            System.out.println("#"+i+" "+cnt);

        }
    }
}
