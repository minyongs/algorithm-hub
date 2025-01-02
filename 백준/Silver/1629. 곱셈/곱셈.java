

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(sol(a,b,c));
    }

    public static long sol(long a, long b, long c) {
        if (b == 0) return 1;

        // b가 짝수인 경우
        if (b % 2 == 0) {
            long temp = sol(a, b/2, c);
            return (temp * temp) % c;
        }
        // b가 홀수인 경우
        else {
            return (a * sol(a, b-1, c)) % c;
        }
    }
}
