class Solution {
    public String solution(int a, int b) {
        int[] days = {30,29,31,30,31,30,31,31,30,31,30,31};
        String[] ans = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        
        if(a == 1){
            return ans[b-1 % 7];
        }else{
            
        int sum = 0;
        for(int i = 0 ; i < a - 1; i++){
            sum += days[i];
        }
        sum += b;
        return ans[sum % 7];
            
        }
    }
}