import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long hidden = 0;
        long sum = 0;

        for(int i = 0; i<num; i++){
            char n = str.charAt(i);             
            if (n >= '0' && n <= '9') {
                hidden = (hidden * 10) + (n - '0');
            } else {
                sum += hidden;
                hidden = 0;
            }
        }
        sum += hidden;
        System.out.println(sum);
    }
}