import java.util.*;
class Solution {
    public String solution(String s) {
        //배열 변환
        String[] stringArr = s.split(" ");
        
        //int 배열 변환
        int[] intArr = new int[stringArr.length];
        for(int i = 0 ; i < stringArr.length; i++){
            int changed = Integer.parseInt(stringArr[i]);
            intArr[i] = changed;
        }
        
        Arrays.sort(intArr);
        
        return String.valueOf(intArr[0])+" "+String.valueOf(intArr[intArr.length-1]);
    }
}