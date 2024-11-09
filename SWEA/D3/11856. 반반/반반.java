

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //TC 개수

        for(int i = 1 ; i <= T; i++){
            String s = br.readLine();
            int cnt = 0;
            HashMap<Character,Integer> map = new HashMap<>();
            boolean ans = false;
            for(int j = 0 ; j < s.length();j++){
                if(!map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j), 1);
                }else{
                    map.replace(s.charAt(j),map.get(s.charAt(j))+1);
                }

                if(map.size() > 2){
                    ans = false;
                }else{
                    for(Character key : map.keySet()){
                        if(map.get(key) >2){
                            ans =false;
                        }else{
                            ans = true;
                        }
                    }
                }
            }
            String print = ans ?"Yes" : "No";
            System.out.println("#" + i +" "+print);
        }
    }
}
