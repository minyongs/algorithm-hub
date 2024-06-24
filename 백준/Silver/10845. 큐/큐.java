import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception{
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            String s = br.readLine();

            if(s.startsWith("push")){
                push(s,queue);
            } else if (s.startsWith("pop")) {
                System.out.println(pop(queue));
            } else if (s.startsWith("size")) {
                System.out.println(size(queue));
            } else if (s.startsWith("empty")) {
                System.out.println(empty(queue));
            } else if (s.startsWith("front")) {
                System.out.println(front(queue));
            } else if (s.startsWith("back")) {
                System.out.println(back(queue));

            }
        }



    }

    public static void push(String s,Queue<Integer> queue){
        String[] arr= s.split(" ");
        int n = Integer.parseInt(arr[1]);
        queue.offer(n);
    }

    public static int pop(Queue<Integer> queue){
        if(!queue.isEmpty()) {
            return queue.poll();
        }else{
            return -1;
        }
    }

    public static int size(Queue<Integer> queue){
        return queue.size();
    }

    public static int empty(Queue<Integer> queue){
        if(queue.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }

    public static int front(Queue<Integer> queue){
        if(!queue.isEmpty()){
            return queue.peek();
        }else{
            return -1;
        }
    }

    public static int back(Queue<Integer> queue) {
        if (!queue.isEmpty()) {
            return ((LinkedList<Integer>) queue).getLast();
        } else {
            return -1;
        }
    }
}
