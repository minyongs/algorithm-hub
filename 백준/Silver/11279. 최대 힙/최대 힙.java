
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(pq.isEmpty()){
                    ans.add(0);
                }else{
                    ans.add(-(pq.poll()));
                }
            }else{
                pq.add(-input);
            }
        }
        for(int i : ans){
            System.out.println(i);
        }
    }
}