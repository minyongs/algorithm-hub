

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        //0처리
        if(n==0) System.out.println(0);


        else{
            while(n!=1){
                sb.append(Math.abs(n % -2));
                n = (int)Math.ceil((double)n/(-2));//음수로 이진법을 계산할때
            }
            sb.append(n);

            System.out.println(sb.reverse());
        }

    }
}
