
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n: 피연산자의 개수 (A, B, C, ...)
        int n = Integer.parseInt(br.readLine());

        // 후위 표기식 문자열 입력
        String s = br.readLine();

        // A, B, C, D ...에 대응되는 숫자를 저장하는 Map
        Map<Character, Double> map = new HashMap<>();
        char c = 'A';  // 문자 'A'부터 시작하여 순차적으로 값을 할당

        // 각 문자에 해당하는 숫자를 입력받아 map에 저장
        for (int i = 0; i < n; i++) {
            map.put(c, Double.parseDouble(br.readLine()));
            c++;
        }

        // 후위 표기식을 처리하기 위한 스택
        Stack<Double> stack = new Stack<>();

        // 후위 표기식 문자열을 하나씩 처리
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 문자가 알파벳(A, B, C...)이면 map에서 해당 값을 스택에 push
            if (Character.isAlphabetic(ch)) {
                stack.push(map.get(ch));  // 대응되는 값을 스택에 push
            } else {  // 연산자일 경우
                // 스택에서 두 개의 값을 꺼내서 연산 수행
                double a = stack.pop();
                double b = stack.pop();
                double ans = 0;

                // 연산자에 따라 계산
                if (ch == '+') {
                    ans = b + a;
                } else if (ch == '-') {
                    ans = b - a;
                } else if (ch == '*') {
                    ans = b * a;
                } else if (ch == '/') {
                    ans = b / a;
                }

                // 연산 결과를 다시 스택에 push
                stack.push(ans);
            }
        }

        System.out.printf("%.2f\n", stack.pop());  // 최종 결과를 소수점 두 번째 자리까지 출력
    }
}

