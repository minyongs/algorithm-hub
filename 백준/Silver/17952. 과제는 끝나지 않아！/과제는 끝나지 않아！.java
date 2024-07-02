import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<int[]> stack = new Stack<>();

        int totalScore = 0; // 총 점수


        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");

            if (arr.length == 3) { // 새로운 작업이 주어질 때
                int score = Integer.parseInt(arr[1]);
                int time = Integer.parseInt(arr[2]);
                stack.push(new int[]{score, time}); // 작업을 스택에 추가
            }

            if (!stack.isEmpty()) { //스택에서 가장 나중에 들어온 것부터 처리
                int[] task = stack.pop();
                task[1]--;
                if (task[1] == 0) {
                    totalScore += task[0];
                } else {
                    stack.push(task);
                }
            }

            


        }
        System.out.println(totalScore);
    }
}
