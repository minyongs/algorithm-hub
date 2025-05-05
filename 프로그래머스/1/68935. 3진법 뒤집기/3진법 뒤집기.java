class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(s);
        
        String reversed = sb.reverse().toString();
        
        int ans =  Integer.parseInt(reversed, 3);
        return ans;

    }
}