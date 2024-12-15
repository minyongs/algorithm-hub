import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); 

        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine());
        int max = 0; 

        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]);
        }

       
        int start = 0;
        int end = max;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2; 
            long total = 0;

            
            for (int tree : trees) {
                if (tree > mid) {
                    total += (tree - mid);
                }
            }

            if (total >= m) { // 필요한 길이 이상일 경우
                result = mid; // 가능한 H 저장
                start = mid + 1; // 더 큰 H 탐색
            } else { // 필요한 길이보다 짧은 경우
                end = mid - 1; // 더 작은 H 탐색
            }
        }

        System.out.println(result);
    }
}
