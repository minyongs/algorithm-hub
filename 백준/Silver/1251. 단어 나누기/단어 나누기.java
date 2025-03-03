
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        flip(s);

        Collections.sort(list);
        System.out.println(list.get(0));

    }

    private static void flip(String s){
        
        for(int i = 0 ; i < s.length(); i++){
            for(int j = i + 1; j < s.length() - 1; j++){
                StringBuilder sb = new StringBuilder();
                String part1 = s.substring(0, i + 1);
                String part2 = s.substring(i + 1, j + 1);
                String part3 = s.substring(j + 1);

                sb.append(new StringBuilder(part1).reverse()).append(new StringBuilder(part2).reverse()).append(new StringBuilder(part3).reverse());
                list.add(sb.toString());
            }
        }
    }
}
