import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n; i++){
            String s = br.readLine();
            if(isVPS(s)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }

    private static boolean isVPS(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++) {
        if(s.charAt(i) == '('){
            stack.push('('); // 여는 괄호는 무조건 push
        }else if(s.charAt(i)==')'){ //닫는 괄호가 나왔을때
            if(!stack.isEmpty() && stack.peek()=='('){ //앞이 여는 괄호+ 스택이 비어있지 않으면 pop
                stack.pop();
            }else{
                stack.push(')'); //앞도 닫는 괄호면 그대로 push
            }
        }
        }
        return stack.isEmpty();
    }
}
