import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        Set<Integer> skipSet = new HashSet<>();
        for(int i = 0; i < skip.length(); i++){
            skipSet.add(skip.charAt(i) - 'a');
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            int letter = s.charAt(i) - 'a';
            int cnt = 0;
            
            while(cnt < index){
                letter = (letter + 1) % 26;
                if(skipSet.contains(letter)) continue;
                cnt++;
            }
            sb.append((char)(letter + 'a'));
        }
        
        return sb.toString();
    }
}
