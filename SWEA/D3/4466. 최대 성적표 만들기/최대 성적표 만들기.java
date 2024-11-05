

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //TC 개수

        for(int i = 1 ; i <= T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n =Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list,Collections.reverseOrder());
            int sum = 0;
            for(int j = 0 ; j < k ; j++){
                sum += list.get(j);
            }
            System.out.println("#"+i+" "+sum);
        }
    }
}
