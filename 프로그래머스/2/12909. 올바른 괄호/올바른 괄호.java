import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length(); i++){
            // '('가 들어오면 Stack 에 push
            char letter = s.charAt(i);
            
            if(letter == '('){
                stack.push(letter);
            }else if(letter == ')'){ // ')'가 들어오면 Stack pop(단, Stack 이 비어있으면 X)
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }
                stack.pop();
            }
  
        }
        // loop를 다 돌았는데 Stack이 비어있지 않으면 return false
        if(!stack.isEmpty()){
            answer = false;
        }

        return answer;
    }
}