

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] arr = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int[][] idxArr = new int[n][2]; // 0 은 숫자 , 1은 idx

        for(int i = 0 ; i < n ; i++){
            idxArr[i][0] = arr[i];
            idxArr[i][1] = i;
        }

        Arrays.sort(idxArr,Comparator.comparingInt(o->o[0]));

        int[] ans = new int[n];


        for(int i = 0 ; i < n; i++){
            ans[idxArr[i][1]] = i;
        }

        for(int i : ans){
            System.out.print( i + " ");
        }


    }
}
// 1 1 2 3
// 2 1 3 1
//  0
