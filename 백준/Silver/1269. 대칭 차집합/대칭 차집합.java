

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<Integer> set1 = new LinkedHashSet<>();
        HashSet<Integer> set2 = new LinkedHashSet<>();
         st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < a; i++){
            set1.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < b ; i++){
            set2.add(Integer.parseInt(st.nextToken()));
        }
        int cnt = 0;
        for(int i : set1){
            if(set2.add(i)){
                cnt ++;
            }
        }
        for(int i : set2){
            if(set1.add(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
