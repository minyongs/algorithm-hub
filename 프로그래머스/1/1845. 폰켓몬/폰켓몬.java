import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int ans = 0;
        //set선언
        HashSet<Integer> set = new HashSet<>();
        //set에 담기
        for(int i = 0 ; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        // 중복 제거한 숫자 개수
        int setSize = set.size();
        int maxSize = nums.length / 2;
        
        // 중복 제거한 숫자 개수가 N/2 보다 크면 maxSize 리턴
        if(setSize >= maxSize){
            ans = maxSize;
        }else ans = setSize;
             
         
        // Return
        return ans;
    }
}