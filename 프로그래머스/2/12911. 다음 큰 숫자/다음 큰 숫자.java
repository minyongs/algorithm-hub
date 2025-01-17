class Solution {
    public int solution(int n) {
        int cnt1 = countOne(n);

        for (int i = n + 1; ; i++) { // 무한 루프로 변경
            int cnt2 = countOne(i);
            if (cnt1 == cnt2) {
                return i;
            }
        }
    }

    public int countOne(int num) {
        String str = Integer.toBinaryString(num);
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                cnt++;
            }
        }

        return cnt;
    }
}
