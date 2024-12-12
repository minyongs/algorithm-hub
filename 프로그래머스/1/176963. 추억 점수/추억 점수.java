import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < name.length; i++){
            map.put(name[i],yearning[i]);
        }
        
        int[] ans = new int[photo.length];
        
         for(int i = 0 ; i < photo.length; i++){
             int len = photo[i].length;
             int sum = 0;
             for(int j = 0 ; j < len; j++){
                 if(map.containsKey(photo[i][j])){
                     sum += map.get(photo[i][j]);
                 }
             }
             ans[i] = sum;
         }
       
       
        
        return ans;
    }
}