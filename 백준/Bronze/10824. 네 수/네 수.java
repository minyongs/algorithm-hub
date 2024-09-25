

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 4; i++){
            arr[i] = st.nextToken();
        }
        long i = Long.parseLong(arr[0] + arr[1]); // Long 까지 갈 가능성 있음
        long i1 = Long.parseLong(arr[2] + arr[3]);

        System.out.println(i+i1);


    }
}
