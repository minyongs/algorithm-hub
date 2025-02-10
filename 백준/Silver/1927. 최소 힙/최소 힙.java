
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(queue.isEmpty()){
                    ans.add(0);
                }else{
                    ans.add(queue.poll());
                }
            }else{
                queue.offer(input);
            }
        }
        for(int i : ans){
            System.out.println(i);
        }
    }
}
