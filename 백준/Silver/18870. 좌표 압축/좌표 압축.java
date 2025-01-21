

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 중복 제거하며 정렬
        int[] sortedArr = Arrays.stream(arr)
                .distinct()
                .sorted()
                .toArray();
        
        // map 에 key로
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < sortedArr.length; i++){
            map.put(sortedArr[i], i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < n; i++){
            stringBuilder.append(map.get(arr[i])).append(" ");
        }

        System.out.println(stringBuilder.toString());

    }
}