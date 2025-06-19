import java.util.*;
class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        
        char[] arr = s.toCharArray();
        int[] ans = new int[s.length()];
        int idx = 0;
        
        for(int i = s.length() - 1; i >= 0; i--){
            ans[idx] = arr[i] - '0';
            idx ++;
        }
        return ans;
    }
}