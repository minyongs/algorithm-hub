

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //TC 개수

        for(int j = 1 ; j <= T; j++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = 0;
            int a = Integer.parseInt(st.nextToken()); // a 개의 과자를
            int b = Integer.parseInt(st.nextToken()); // b 명에게
            if (a % b != 0) {
                ans = 1;
            }

            System.out.println("#"+j+" "+ans);

        }
    }
}
