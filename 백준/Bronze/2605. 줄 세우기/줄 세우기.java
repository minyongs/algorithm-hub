

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
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

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);

        for(int i = 1; i < n; i++){
            if(arr[i] == 0){
                list.add(i+1);
            }else{
                list.add(i - arr[i],i+1);
            }
        }

        for(int i : list){
            System.out.print(i+" ");
        }
    }
}
