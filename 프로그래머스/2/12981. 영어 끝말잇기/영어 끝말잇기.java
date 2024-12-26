import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] ans = new int[2];
        ans[0] = 0;
        ans[1] = 0;
        
        HashSet<String> set  = new HashSet<>();
        
        for(int i = 0; i < words.length; i++) {
            int num = (i % n) + 1; // 번호
            int order = (i / n) + 1; // 차례 (몇번째에 탈락했는지) 

            
            if ((i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) || set.contains(words[i])) {
                ans[0] = num;
                ans[1] = order;
                return ans;  
            }

            set.add(words[i]);
        }
        
        return ans;  
    }
}
