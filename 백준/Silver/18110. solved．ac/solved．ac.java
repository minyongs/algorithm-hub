

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];
        for(int i = 0 ; i < n ; i++){
            scores[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(scores);
        int remove = (int)Math.round(n * 0.15);
        int sum = 0;
        for(int i = remove  ; i < scores.length - remove; i++){
            sum += scores[i];
        }
        int count = n - 2 * remove;
        int ans = (int) Math.round((double) sum / count);

        System.out.println(ans);

    }
}
