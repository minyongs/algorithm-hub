

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;
import java.util.StringTokenizer;


//Queue 로 풀었다가 시간 초과 났습니다 !!
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];//입력 배열
        int[] ans = new int[n];//정답 배열
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < n; i++){
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]){ //while 문 왜 쓰는지 잘 이해 안감
                ans[stack.pop()] = arr[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()){ //stack 에 남아있으면 -1
            ans[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            sb.append(ans[i]).append(' '); 
        }
        System.out.println(sb.toString());

    }
}
