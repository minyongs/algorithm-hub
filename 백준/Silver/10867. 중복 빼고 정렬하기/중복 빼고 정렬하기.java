

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i++){
            int a = Integer.parseInt(st.nextToken());
            if(!list.contains(a)){
                list.add(a);
            }
        }

        Collections.sort(list);

        for(int i : list){
            System.out.print(i+" ");
        }

    }
}
