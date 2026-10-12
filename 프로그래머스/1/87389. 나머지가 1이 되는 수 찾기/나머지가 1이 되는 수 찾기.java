class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 1; i <= n-1; i++){
            if(n % i == 1){
                break;
            }else answer++;
        }
        return answer;
    }
}