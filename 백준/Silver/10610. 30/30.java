
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine(); 
        char[] arr = s.toCharArray();
        List<Integer> list = new ArrayList<>();

        
        for (char c : arr) {
            list.add(c - '0');
        }

        
        Collections.sort(list, Collections.reverseOrder());

        
        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        
        if (sum % 3 == 0 && list.contains(0)) {
            StringBuilder result = new StringBuilder();
            for (int num : list) {
                result.append(num);
            }
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
