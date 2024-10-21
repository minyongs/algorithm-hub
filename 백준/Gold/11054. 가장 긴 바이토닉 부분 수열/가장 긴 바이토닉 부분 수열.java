

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n]; // 입력된 수열 저장

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int[] left = new int[n]; // 왼쪽에서 오른쪽으로 증가하는 부분 수열의 길이
        int[] right = new int[n]; // 오른쪽에서 왼쪽으로 감소하는 부분 수열의 길이


        for (int i = 0; i < n; i++) {// 왼쪽부터 증가하는 수열
            left[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    left[i] = Math.max(left[i], left[j] + 1);
                }
            }
        }


        for (int i = n - 1; i >= 0; i--) { // 오른쪽부터 감소하는 수열
            right[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i]) {
                    right[i] = Math.max(right[i], right[j] + 1);
                }
            }
        }

        
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, left[i] + right[i] - 1);
        }

        System.out.println(max); // 가장 긴 바이토닉 부분 수열의 길이 출력
    }
}
