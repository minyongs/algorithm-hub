

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());

        int[] a = new int[aSize];
        int[] b = new int[bSize];

        st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < aSize; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < bSize; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;

        
        while (i < aSize && j < bSize) {
            if (a[i] <= b[j]) {
                ans.append(a[i]).append(" ");
                i++;
            } else {
                ans.append(b[j]).append(" ");
                j++;
            }
        }

        
        while (i < aSize) {
            ans.append(a[i]).append(" ");
            i++;
        }
        while (j < bSize) {
            ans.append(b[j]).append(" ");
            j++;
        }

        System.out.println(ans.toString());
    }
}
