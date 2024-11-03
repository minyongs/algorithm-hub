

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int[] ans = new int[6];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n == 0){
                break;
            }else{
                arr = new int[n];
                for(int i = 0 ; i < n ; i ++){
                    arr[i] = Integer.parseInt(st.nextToken());
                }
                
                sb.setLength(0); // TC 마다 새로운 sb 할당 
                comb(0,0);
                System.out.println(sb.toString());
            }
        }
    }

    private static void comb(int start , int depth){
        if (depth == 6) { // 6개의 숫자를 선택한 경우
            for (int i = 0; i < 6; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }


        for(int i = start; i < arr.length; i++){
            ans[depth] = arr[i];
            comb(i+1,depth+1);
        }
    }
}
