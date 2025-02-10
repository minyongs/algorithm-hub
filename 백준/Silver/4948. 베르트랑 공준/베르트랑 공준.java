
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            System.out.println(countPrimes(n));
        }
    }


    public static int countPrimes(int n) {
        int count = 0;
        boolean[] isTrue = new boolean[2*n + 1]; // false면 소수


        for(int i = 2; i * i <= 2*n; i++) {
            if(!isTrue[i]) {
                for(int j = i * i; j <= 2*n; j += i) {
                    isTrue[j] = true;
                }
            }
        }
        for(int i = n + 1; i <= 2*n; i++) {
            if(i > 1 && !isTrue[i]) count++;
        }

        return count;
    }
}
