

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int idx = -1;

        // 뒤에서부터 처음으로 감소하는 곳을 idx 설정
        for(int i = arr.length - 1; i > 0 ; i--){
            if(arr[i] > arr[i-1]){
                idx = i - 1;
                break;
            }
        }
        if (idx == -1) { // 내림차순 순열인 경우
            System.out.println(-1);
            return;
        }
        int min = Integer.MAX_VALUE;
        //다시 뒤에서부터 arr[idx] 보다 큰 가장 작은값 찾기
        int changeIdx = n - 1;
        while (arr[changeIdx] <= arr[idx]) { // arr[idx] 보다 작거나 같으면 종료
            changeIdx--;
        }

        swap(arr,idx,changeIdx);
        Arrays.sort(arr,idx + 1 , n);

        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    private static int[] swap(int[] arr , int idx , int changeIdx){
        int temp = arr[idx];
        arr[idx] = arr[changeIdx];
        arr[changeIdx] = temp;

        return arr;
    }


}
