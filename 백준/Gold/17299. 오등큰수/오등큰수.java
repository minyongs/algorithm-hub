

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] cnt = new int[1000001];
        int[] ans = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());//입력값
            cnt[arr[i]]++;//입력값이 몇번 등장했는지 입력값 배열에 저장
        }
        Stack<Integer> stack  = new Stack<>();


        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && cnt[arr[stack.peek()]]<cnt[arr[i]]){
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            ans[stack.pop()] = -1;

        for(int i = 0; i<n; i++)
            sb.append(ans[i]).append(" ");

        System.out.println(sb.toString());




    }
}
