import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();


        for(int i = 0 ; i <s.length(); i++){
           if(s.charAt(i)=='<'){// < 만나면
               while ((!stack.isEmpty())){
                   sb.append(stack.pop()); // 원래 있던 stack 이 빌때까지 pop -> 거꾸로 stringbuilder에 저장됨
               }


               while (s.charAt(i)!= '>'){ // > 만날때까지
                   sb.append(s.charAt(i++)); // 뒤집지 않고 그대로 저장
               }
               sb.append('>'); // 꺽쇠 닫기

           } else if (s.charAt(i)==' ') { // 공백 만나면
               while (!stack.isEmpty())sb.append(stack.pop()); //스택이 빌때까지 StringBuilder 에 저장
               sb.append(' ');
           }else{
               stack.push(s.charAt(i)); // 그 무엇도 만나지 않으면 스택에 저장
           }


        }
        while (!stack.isEmpty()){ // 남은 문자열까지 다 뒤집어
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());



    }


}
