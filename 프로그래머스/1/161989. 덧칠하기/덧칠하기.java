class Solution {
    public int solution(int n, int m, int[] section) {
        
        // 첫번째 숫자부터 롤
        int rolled = section[0] + m - 1;
        int cnt = 1;
        for(int i = 1 ; i < section.length; i++){
            if(section[i] > rolled){
                rolled = section[i] + m - 1;
                cnt++;
            }
        }
        return cnt;
    }
}