import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt1 = 0;
        for (int num1 : lottos) {
            if (num1 == 0) cnt1++;
        }

        Set<Integer> set = new HashSet<>();
        for (int num2 : win_nums) {
            set.add(num2);
        }

        int cnt2 = 0;
        for (int lotto : lottos) {
            if (set.contains(lotto)) {
                cnt2++;
            }
        }

        int max = rank(cnt2 + cnt1);
        int min = rank(cnt2);

        return new int[] {max, min};
    }

    public int rank(int result) {
        switch (result) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
