
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static boolean[] visit;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        visit = new boolean[n+1];
        arr = new int[n];

        print(0);


    }

    private static void print(int depth){

        if(depth == n){
            for(int i : arr){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }


        for(int i = 1; i <= n; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i;
                print(depth + 1);
                visit[i] = false;
            }
        }
    }


}
