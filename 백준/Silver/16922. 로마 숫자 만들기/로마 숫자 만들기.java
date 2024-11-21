

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static int[] arr = {1, 5, 10, 50};
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        dfs(0,0,n,0);
        System.out.println(set.size());
    }

    private static void dfs(int depth, int start,int n,int sum){
        if(depth ==  n){
            set .add(sum);
            return;
        }

        for(int i = start ; i < arr.length; i++){
            dfs(depth+1 , i , n,sum + arr[i]);
        }

    }
}
