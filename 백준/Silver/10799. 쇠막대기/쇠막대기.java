import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        char[] c = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();  // 열린 괄호를 저장할 스택
        int ans = 0;  // 최종 막대기 조각 수를 저장할 변수

        // 입력으로 받은 괄호들을 하나씩 처리
        for(int i = 0; i < c.length; i++) {

            // 열린 괄호 '('를 만나면 스택에 push
            if(c[i] == '(') stack.push(c[i]);
            else {
                // 닫는 괄호 ')'를 만났을 때 이전 문자가 열린 괄호 '('이면 레이저
                if(c[i-1] == '(') {
                    // 레이저이므로 스택에서 열린 괄호를 pop한 후,
                    // 스택에 남아 있는 '('의 개수만큼 막대기가 나뉘므로 그 개수를 결과에 더함
                    stack.pop();
                    ans += stack.size();  // 현재 스택에 남아있는 '('의 개수 = 잘려진 막대기 수
                }
                else {
                    // 이전 문자가 열린 괄호가 아니면 막대기의 끝
                    // 스택에서 열린 괄호 하나를 pop하고 막대기 조각 하나가 완성되었으므로 결과에 1을 더함
                    stack.pop();
                    ans++;  // 막대기의 끝 부분이므로 조각 하나 추가
                }
            }
        }


        System.out.println(ans);
    }
}
