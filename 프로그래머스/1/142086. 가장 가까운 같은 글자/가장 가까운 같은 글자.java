import java.util.*;
class Solution {
    public int[] solution(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int[] ans = new int[s.length()];
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(map.containsKey(c)){
                ans[i] = i - map.get(c);
            }else{
                ans[i] = -1;
            }
            map.put(c,i);
        }
        
        return ans;
    }
}