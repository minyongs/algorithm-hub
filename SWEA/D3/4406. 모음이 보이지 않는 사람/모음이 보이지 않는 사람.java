

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)!='a' && s.charAt(j)!='e'&&s.charAt(j)!='i'&&s.charAt(j)!='o'&&s.charAt(j)!='u'){
                    sb.append(s.charAt(j));
                }
            }

           System.out.println("#" + i +" " + sb.toString());
        }
    }
}
