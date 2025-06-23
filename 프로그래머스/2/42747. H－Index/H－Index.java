import java.util.*;
class Solution {
    public int solution(int[] citations) {
        List<Integer> list = new ArrayList<>();
        
        for(int i : citations){
            list.add(i);
        }
        
        Collections.sort(list,Collections.reverseOrder());
        
        int hIdx = 0;
        for(int i = 0 ; i < citations.length; i++){
            if((i + 1) <= list.get (i)){
                hIdx = i + 1;
            }
        }
        return hIdx;
    }
}