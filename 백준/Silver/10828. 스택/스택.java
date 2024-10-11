import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//스택[실버4]
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n; i++) {
            String s = br.readLine();

            if(s.startsWith("push")){
                String[] arr = s.split(" ");
                int num = Integer.parseInt(arr[1]);
                stack.push(num);
            }else if(s.startsWith("pop")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{
                int pop = stack.pop();
                System.out.println(pop);
                }

            } else if (s.startsWith("size")) {
                System.out.println(stack.size());
            } else if (s.startsWith("empty")) {
                if(stack.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                if(!stack.isEmpty()) {
                    int top = stack.peek();
                    System.out.println(top);
                }else System.out.println(-1);
            }
        }
    }
}
