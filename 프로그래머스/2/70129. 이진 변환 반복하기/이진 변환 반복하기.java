class Solution {
    public int[] solution(String s) {
        int[] ans = new int[2];
        int zeros = 0;
        int cnt = 0;
        
        while(!s.equals("1")){
            zeros += countZero(s);
            s = convert(s);
            cnt++;
        }
        ans[0] = cnt;
        ans[1] = zeros;
        return ans;
    }
    
    public static int countZero(String s){
        String zeroDeleted = s.replaceAll("0","");
        return s.length() - zeroDeleted.length();
    }
    
    public static String convert(String s){
        String s2 = s.replaceAll("0","");
        return Integer.toBinaryString(s2.length());
        
    }
}