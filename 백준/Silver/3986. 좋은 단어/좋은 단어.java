import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(wordCheck(s)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static boolean wordCheck(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0)); //첫번째건 그냥 넣음
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) { //스택이 비어있지 않고, 현재 체크하는 문자가 스택의 최상단과 같을때 삭제
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
