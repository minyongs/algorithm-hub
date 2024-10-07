

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[1000001]; // 소수만 저장해놓을 배열 -> False 가 소수 !
        arr[0] = arr[1] = true;

        for(int i = 2 ; i * i <= arr.length; i++){ // 에라토스머시기의 체
            if(arr[i]) continue;
            for(int j = i*i ; j < arr.length; j += i){
                arr[j] = true;
            }
        }

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T --> 0){
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            for(int i = 2 ; i <= N/2; i++){ // 절반만 탐색하면 됨 ! 중복은 허용 X
                if(!arr[i] && !arr[N-i]) cnt++; // arr[i] , arr[N-i] 를 더하면 N 이므로 두 소수의 합으로 표현할 수 있으면
            }
            sb.append(cnt + "\n");
        }

        System.out.println(sb.toString());
    }
}
