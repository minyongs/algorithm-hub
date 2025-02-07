import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] ans = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0 ; i < score.length; i++){
            pq.offer(score[i]);
            if(pq.size() > k){
                pq.poll();
            }
            ans[i] = pq.peek();
        }
        
        return ans;
    }
}