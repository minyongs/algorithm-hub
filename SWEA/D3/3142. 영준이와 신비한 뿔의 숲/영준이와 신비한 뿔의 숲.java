

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int j = 1 ; j <= T ; j++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n  = Integer.parseInt(st.nextToken());//뿔
            int m  = Integer.parseInt(st.nextToken());//짐승
            int unicorn = 0;
            int twin = 0;
            while(true){

                if(m * 2 == n){
                    twin = m;
                    break;
                }
                m--;
                n--;
                unicorn++;
            }

            System.out.println("#"+j+" "+unicorn+" "+twin);
        }
    }
}
