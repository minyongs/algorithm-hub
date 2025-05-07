import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        //Map 에 저장
        // discount 를 돌며 key 감소
        // 모든 key 의 value 가 0 일 때 cnt ++
        int cnt = 0;
        
        for(int i = 0 ; i <= discount.length - 10; i++){
            Map<String,Integer> map = new HashMap<>();
            
            for(int j = 0 ; j < want.length; j++){
                map.put(want[j],number[j]); // map 에 초기화
            }
            
            for(int j = i ; j < i + 10; j++){
                if(map.containsKey(discount[j])){
                    map.put(discount[j],map.get(discount[j]) - 1);
                }
            }
            boolean allZero = true;
            for(int val : map.values()){
                if(val != 0){
                    allZero = false;
                    break;
                }
            }
            if(allZero) cnt ++;
        }
        return cnt;
    }
}