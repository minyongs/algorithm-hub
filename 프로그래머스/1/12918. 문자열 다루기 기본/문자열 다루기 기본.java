import java.util.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()!= 4 && s.length() != 6){
            answer =false;
        }
        
        char[] arr = s.toCharArray();
        
        for(char c : arr){
            if(Character.isAlphabetic(c)){
                answer = false;
                break;
            }
        }
     
        return answer;
    }
}