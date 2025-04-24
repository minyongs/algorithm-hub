

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = br.readLine();
        }

        int idx = arr[0].length() - 1;
        int ans = 0;
        while(idx>=0){
            String s = "";
            for(int i = 0 ; i < n; i++){
                s = arr[i].substring(idx,arr[0].length());
                set.add(s);
            }
            if(set.size() == n){
                ans = s.length();
                break;
            }else{
                idx --;
                set.clear();
            }
        }
        System.out.println(ans);


    }
}
