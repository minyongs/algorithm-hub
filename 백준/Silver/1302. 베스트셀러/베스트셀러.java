

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0 ; i < n; i++){
            String s = br.readLine();
            if(map.containsKey(s)){
                int val = map.get(s);
                map.replace(s,val + 1);
            }else{
                map.put(s,1);
            }
        }
        int maxCnt = 0;
        String ans = "";
        for(String key : map.keySet()){
            int val = map.get(key);
            if(val > maxCnt || maxCnt == val && key.compareTo(ans)<0){
                maxCnt = val;
                ans = key;
            }
        }

        System.out.println(ans);
    }
}
