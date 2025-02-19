

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    static int N,K;
    static int[] arr;
    static HashSet<String> set = new HashSet<>();
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        arr = new int[N];
        visit = new boolean[N];

        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        backTrack(0,"");
        System.out.println(set.size());
    }

    private static void backTrack(int depth,String a){

        if(depth == K){
            set.add(a);
            return;
        }

        for(int i = 0 ; i < N; i++){
            if(!visit[i]){
                visit[i] = true;
                backTrack(depth + 1,a + arr[i]);
                visit[i] = false;
            }
        }
    }
}
