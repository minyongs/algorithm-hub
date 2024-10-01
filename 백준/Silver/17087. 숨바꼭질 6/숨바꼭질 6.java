

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 찾아야 하는 동생의 수
        int S = Integer.parseInt(st.nextToken()); // 현재 수빈이의 위치
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] copy = new int[N];
        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            copy[i] = Math.abs(arr[i]-S); // 차이
        }

        int ans = copy[0];

        for(int i = 1 ; i < copy.length;i++){
            ans = gcd(ans,copy[i]);
        }

        System.out.println(ans);






    }

    public static int gcd(int a, int b) {//30,60
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
