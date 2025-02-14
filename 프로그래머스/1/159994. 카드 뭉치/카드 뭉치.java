class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int pos1 = 0;
        int pos2 = 0;
        
        for(String s : goal){
            if(pos1 < cards1.length && s.equals(cards1[pos1])){
                pos1++;
            }else if(pos2 < cards2.length && s.equals(cards2[pos2])){
                pos2++;
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}