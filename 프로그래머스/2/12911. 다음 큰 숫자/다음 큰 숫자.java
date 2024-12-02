class Solution {
    public int solution(int n) {
        
        int countOnes = count(Integer.toBinaryString(n));

        
        while (true) {
            n++;
            if (count(Integer.toBinaryString(n)) == countOnes) {
                return n;
            }
        }
    }

    
    private static int count(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}
