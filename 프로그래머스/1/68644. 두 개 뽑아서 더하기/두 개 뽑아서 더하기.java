import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<numbers.length;i++){
    
            for(int j= i+1; j<numbers.length;j++){
                int sum =numbers[i] + numbers[j];
                //만약에 list에 숫자가 있으면 넘어가고
                if(!list.contains(sum)){
                    list.add(sum);
                }else{
                    continue;
                }
                
            }
        }
            
            Collections.sort(list);
            int[] answer = new int[list.size()];
            
            for(int i =0; i<list.size();i++){
                answer[i]  = list.get(i);
            }
            
            
            
        
        
        
        return answer;
    }
}