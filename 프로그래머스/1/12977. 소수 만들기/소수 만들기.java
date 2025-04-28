class Solution {
    public int solution(int[] nums) {
        int cnt = 0;
        
        for(int i = 0 ; i < nums.length-2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1 ; k < nums.length; k ++){
                    int sum = 0;
                    sum = nums[i] + nums[j] + nums[k];
                    cnt += isSosu(sum);
                }
            }
        }
        
        return cnt;
    }
    
    static int isSosu(int sum){
        for(int i = 2 ; i <= sum / 2; i++){
            if(sum % i == 0){
                return 0;
            }
        }
        return 1;
    }
}