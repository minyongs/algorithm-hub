import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1 ; i <=n;i++ ){
            queue.add(i);
        }
        List<Integer> list = new ArrayList<>();
        while (queue.size()!=1){
            list.add(queue.poll());
            queue.add(queue.poll());
        }

        list.add(queue.poll());
        
        for(int i : list){
            System.out.print(i+" ");
        }










    }
}
