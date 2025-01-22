
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < n; i++){
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                stack.pop();
            }else{
                stack.push(input);
            }
        }

        int ans = 0;
        int size = stack.size();
        for(int i = 0 ; i < size; i++){
            ans += stack.pop();
        }

        System.out.println(ans);  
    }
}