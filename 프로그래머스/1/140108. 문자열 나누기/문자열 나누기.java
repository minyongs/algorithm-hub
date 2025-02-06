class Solution {
    public int solution(String s) {
        int ans = 0;
        int xCnt = 0;
        int otherCnt = 0;
        char x = s.charAt(0);
        
        for(int i = 0 ; i < s.length(); i++){
            if(x == s.charAt(i)){
                xCnt ++;
            }else{
                otherCnt++;
            }
            
            if(xCnt == otherCnt){
                ans++;
                if(i < s.length() -1){
                    x = s.charAt(i+1);
                }
                xCnt = 0;
                otherCnt = 0;
            }
        }
        
        if(xCnt  != otherCnt) ans++;
        return ans;
    }
}