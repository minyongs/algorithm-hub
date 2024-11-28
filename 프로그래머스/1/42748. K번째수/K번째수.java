import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        
        int n = commands.length;
        int[] ans = new int[n];
        
        for(int i = 0 ; i < n; i++){
           
            List<Integer> list = new ArrayList<>();
            for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            ans[i] = list.get(commands[i][2] - 1);
        }
        
        return ans;
    }
}