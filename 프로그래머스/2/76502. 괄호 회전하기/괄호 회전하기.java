import java.util.*;
class Solution {
    static Stack<Character> stack = new Stack<>();
    public int solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        int cnt = 0;
        // 문자열 회전
        for(int i = 0 ; i < s.length(); i++){
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            
            if(isRight(sb.toString(),stack)){
                cnt ++;
            }
            
            stack.clear();
        }
        return cnt;
       
    }
    
    private static boolean isRight(String s,Stack<Character> stack){
       
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()) return false;
                
                char top = stack.peek();
                if(top == '(' && ch == ')' || top == '{' && ch =='}' || top =='[' && ch == ']'){
                    stack.pop();
                }else{
                    return false;
                }
            }
    }
        return stack.isEmpty();
}
}