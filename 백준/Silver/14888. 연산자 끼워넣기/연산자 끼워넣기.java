

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] arr;
    static int[] math = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 4; i++){
            math[i] = Integer.parseInt(st.nextToken());
        }

        calculate(arr[0] , 1);

        System.out.println(max);
        System.out.println(min);

    }

    private static void calculate(int result,int idx){
        if(idx == n){
            max = Math.max(max , result);
            min = Math.min(min , result);
            return;
        }


        if(math[0] > 0){
            math[0] --;
            calculate(result + arr[idx],idx + 1);
            math[0]++;
        }

        if(math[1] > 0){
            math[1] --;
            calculate(result - arr[idx], idx + 1);
            math[1]++;
        }

        if (math[2] > 0) {
            math[2]--;
            calculate(result * arr[idx], idx + 1);
            math[2]++;
        }
        // / 연산자 사용
        if (math[3] > 0) {
            math[3]--;
            calculate(result / arr[idx], idx + 1);
            math[3]++;
        }

    }
}
