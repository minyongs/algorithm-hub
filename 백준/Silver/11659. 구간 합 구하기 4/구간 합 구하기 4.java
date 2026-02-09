
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] prefix = new int[N];

        prefix[0] = arr[0];

        for(int i = 1 ; i < N; i++){
            prefix[i] = prefix[i - 1] + arr[i]; // 구간합
        }


        // M번 순회
        for(int i = 0 ; i < M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int ans = 0;
            int k = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if(k != 1){
                ans = prefix[j - 1] - prefix[k - 2];
            }else{
                ans = prefix[j-1];
            }

            System.out.println(ans);
        }

    }
}
