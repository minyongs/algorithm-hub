 import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());  // 내림차순 정렬
        
        int sum = 0;
        int count = 0;
        
        for(int i : list){
            sum += i;
            count++;
            if(sum >= k) break;
        }
        
        return count;
    }
}