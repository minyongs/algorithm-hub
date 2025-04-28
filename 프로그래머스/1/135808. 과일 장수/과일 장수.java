import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        
        // 1 1 1 2 2 3 3
        Arrays.sort(score);
        
        int price = 0;
        
        for(int i = score.length - m; i >=0; i -= m){
            price += score[i] * m;
        }
        
        return price;
    }
}