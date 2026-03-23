class Solution {
    public String solution(String s) {
       StringBuilder sb = new StringBuilder();
        
        int length = s.length();
        boolean isFirst = true;
        
        for(int i = 0 ; i < length; i++){
            char c = s.charAt(i);
            
            if(c == ' '){
                isFirst = true;
                sb.append(c);
            }else{
                if(isFirst){
                    sb.append(Character.toUpperCase(c));
                    isFirst = false;
                }else{
                    sb.append(Character.toLowerCase(c));
                }
            }      
        }
        
        return sb.toString();
    }
}