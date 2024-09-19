
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr= new int[n];
        for(int i = 0; i < n ; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;

        for(int i = 0; i<n; i++){
            int su = arr[i];

            if(su>=num){ // 수열의 값이 현재 num보다 크거나 같으면 그 숫자가 나올 때까지 스택에 push
                while(su>=num){
                    stack.push(num++);
                    sb.append("+\n"); // 정답 출력을 위한 sb
                    
                }

                stack.pop();
                sb.append("-\n");
            }else { // 수열의 값이 num 보다 크지 않을때
               int a = stack.pop();// 수열과 스택이 같으면 pop 하면 되고 , a 가 더 크면 만들수 없어
               if(a > su){
                   System.out.println("NO");
                   result = false;
                   break;
               }else{
                   sb.append("-\n");
               }
            }

        }
        if(result){
            System.out.println(sb.toString());
        }

    }



}
