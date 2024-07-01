import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (s.startsWith("push") && s.contains("back")) {
                pushBack(s);
            } else if (s.startsWith("push") && s.contains("front")) {
                pushFirst(s);
            } else if (s.startsWith("pop") && s.contains("front")) {
                popFront();
            } else if (s.startsWith("pop") && s.contains("back")) {
                popBack();
            } else if (s.equals("size")) {
                size();
            } else if (s.equals("empty")) {
                isEmpty();
            } else if (s.equals("front")) {
                front();
            } else if (s.equals("back")) {
                last();
            }
        }
    }

    static void pushBack(String s) {
        String[] arr = s.split(" ");
        int n = Integer.parseInt(arr[1]);
        deque.addLast(n);
    }

    static void pushFirst(String s) {
        String[] arr = s.split(" ");
        int n = Integer.parseInt(arr[1]);
        deque.addFirst(n);
    }

    static void popFront() {
        if (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        } else {
            System.out.println(-1);
        }
    }

    static void popBack() {
        if (!deque.isEmpty()) {
            System.out.println(deque.pollLast());
        } else {
            System.out.println(-1);
        }
    }

    static void size() {
        System.out.println(deque.size());
    }

    static void isEmpty() {
        if (deque.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static void front() {
        if (!deque.isEmpty()) {
            System.out.println(deque.getFirst());
        } else {
            System.out.println(-1);
        }
    }

    static void last() {
        if (!deque.isEmpty()) {
            System.out.println(deque.getLast());
        } else {
            System.out.println(-1);
        }
    }
}
