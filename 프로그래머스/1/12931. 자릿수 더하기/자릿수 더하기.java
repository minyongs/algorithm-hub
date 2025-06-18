import java.util.*;

public class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        
        int sum = 0;
        for(int i = 0 ; i < s.length(); i++){
            sum += arr[i] - '0';
        }
        
        return sum;
    }
}