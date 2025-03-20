import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int n = answers.length;
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(1,check(answers,one));
        map.put(2,check(answers,two));
        map.put(3,check(answers,three));
        
        int maxScore = Collections.max(map.values());
        
        List<Integer> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxScore) {
                resultList.add(entry.getKey());
            }
        }
        
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
        
        
    }
    
    public static int check(int[] answer,int[] num){
        int cnt = 0;
        int idx = 0;
        int ansIdx = 0;
        
        while(ansIdx != answer.length){
            if(idx == num.length) idx = 0;
            if(answer[ansIdx] == num[idx]){
                cnt++;
            }
            idx++;
            ansIdx++;
        }
        return cnt;
    }
}