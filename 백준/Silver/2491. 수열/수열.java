import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (n == 1) {
            
            System.out.println(1);
            return;
        }

        int max = 0;
        int increaseCnt = 1;
        int decreaseCnt = 1;
        for(int i = 1 ; i < n;i++){

            if(arr[i] >= arr[i-1]){
                increaseCnt ++;
            }else {
                increaseCnt = 1;
            }


            if(arr[i] <= arr[i-1]){
                decreaseCnt ++;
            }else {
                decreaseCnt = 1;
            }

        max = Math.max(max,Math.max(increaseCnt,decreaseCnt));
        }

        System.out.println(max);
    }
}
