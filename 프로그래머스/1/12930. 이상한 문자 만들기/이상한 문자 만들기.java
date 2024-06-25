class Solution {
public  String solution(String s) {
        StringBuilder sb = new StringBuilder();

        char[] charArr = s.toCharArray();
        int idx = 0 ;
        for(int i = 0 ; i < charArr.length;i++){
            if(charArr[i] == ' '){
                idx = 0;
                sb.append(" ");
                continue;
            }else{
                if(idx % 2==0){
                    char a = Character.toUpperCase(charArr[i]);
                    sb.append(String.valueOf(a));
                    idx ++;
                }else{
                    char b = Character.toLowerCase(charArr[i]);
                    sb.append(String.valueOf(b));
                    idx ++;
                }
            }
        }
        return sb.toString();
    }
}