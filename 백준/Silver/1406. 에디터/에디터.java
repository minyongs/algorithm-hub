

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> L = new Stack<>();
        Stack<Character> R = new Stack<>();

        String s = br.readLine();
        for(int i = 0 ; i < s.length(); i++){// 초기단계에서 커서는 가장 오른쪽에 있으므로 L 스택에 전부 push
            L.push(s.charAt(i));
        }
        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++) {
            String command = br.readLine();

            if(command.equals("L")){
                commandL(L,R);
            } else if (command.equals("D")) {
                commandD(L,R);
            }else if(command.equals("B")){
                commandB(L,R);
            }else{
                String[] arr = command.split(" "); // P 이후에 문자가 나오므로 split 처리해준 후 1번 index의 문자를 매개변수로 넘겨줌
                char c = arr[1].charAt(0);
                commandP(c,L,R);
            }

        }

        StringBuilder sb = new StringBuilder();//정답 출력을 위한 sb
        while(!L.isEmpty()){  // L 스택의 문자열부터 sb에 저장
            sb.append(L.pop());
        }

        sb.reverse(); // L 스택의 문자열은 역순으로 출력되므로 메서드를 통해 뒤집어준다

        while (!R.isEmpty()){ // R 스택의 문자는 정상적으로 출력됨 -> L에서 옮겨올때 이미 역순으로 stack 에 들어가있음.
            sb.append(R.pop());
        }
        System.out.println(sb.toString());

    }


    private static void commandL(Stack<Character> L, Stack<Character> R){
        if(!L.isEmpty()){ // 커서가 가장 왼쪽이 아닐때
            R.push(L.pop()); // R 스택으로 L을 pop 해서 이동시킴
        }
    }
    private static void commandD(Stack<Character> L, Stack<Character> R){
        if(!R.isEmpty()){//커서가 맨 오른쪽이 아닐때
            L.push(R.pop());//R스택의 최상단을 L 스택으로 이동시킴 
        }
    }
    private static void commandB(Stack<Character> L, Stack<Character> R){
        if(!L.isEmpty()){ 
            L.pop(); // 커서 왼쪽의 문자을 삭제
        }
    }
    private static void commandP(char c ,Stack<Character> L, Stack<Character> R){
        L.push(c); //커서 왼쪽에 문자 삽입
    }
}
