

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(n%5 != 0){
            if(n<0){
                break;
            }
            n -= 3;
            cnt++;
        }
        if(n < 0){
            System.out.println(-1);
        }else{
            cnt += n/5;
            System.out.println(cnt);
        }


    }
}
