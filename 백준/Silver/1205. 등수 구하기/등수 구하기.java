import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n ;
        int score;
        int p;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        score = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        
        int[] arr = new int[n];
        if(n>0){
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }

        if(n==0){
            System.out.println(1);
            return;
        }

        if(n == p && score <=arr[arr.length-1]){
            System.out.println(-1);
        }else{
            int rank = 1;
            for(int i = 0 ; i< arr.length;i++){
                if(score<arr[i]){
                    rank++;
                }else{
                    break;
                }
            }
            System.out.println(rank);
        }

    }
}
