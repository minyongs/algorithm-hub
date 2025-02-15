class Solution {
    public int solution(int n) {
        
        int ans = 0;
        
        for(int i = 1 ; i <= n; i++){
            int target = 0;
            
            
            for(int j = i; j <= n; j++){
                target += j;
                if(target == n){
                    ans ++;
                    break;
                }
                
                if(target > n){
                    break;
                }
            }
        }
      return ans;
    }
}