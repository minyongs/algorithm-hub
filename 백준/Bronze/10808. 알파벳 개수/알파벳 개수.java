import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String s = br.readLine();
        int[] ans = new int[26];
        for(int i = 0 ; i < s.length();i++){
            for(int j = 0 ; j <26; j++){
                if(s.charAt(i)==alphabets.charAt(j)){
                    ans[j]++;
                    break;
                }
            }
        }
        for(int i : ans){
            System.out.print(i+" ");
        }

    }
}
