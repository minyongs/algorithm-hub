import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(0);
            return;
        }

        Integer[] arr = new Integer[n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        while (true) {
            Arrays.sort(arr, Collections.reverseOrder());
            if (arr[0] < dasom) {
                break;
            } else {
                dasom++;
                arr[0]--;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
