import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<n; i++){
            String s = br.readLine();
            System.out.println(String.valueOf(s.charAt(0))+String.valueOf(s.charAt(s.length()-1)));
        }
    }
}
