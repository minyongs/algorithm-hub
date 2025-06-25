

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];

        for(int i = 0 ; i < 5; i++){
            String s = br.readLine();
            int length = s.length();

            for(int j = 0 ; j < length; j++){
                arr[i][j] = s.charAt(j);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < 15; i++){
            for(int j = 0; j < 5; j++){
                char c = arr[j][i];
                if(c != 0){
                    stringBuilder.append(c);
                }
            }
        }

        String s = stringBuilder.toString();

        System.out.println(s);
    }
}
