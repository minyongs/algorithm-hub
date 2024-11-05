

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int x = 0;

            switch (command) {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    set.add(x);  
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    set.remove(x);  
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    sb.append(set.contains(x) ? "1\n" : "0\n");  
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        set.remove(x);  
                    } else {
                        set.add(x);  
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);  
                    }
                    break;
                case "empty":
                    set.clear();  
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}
