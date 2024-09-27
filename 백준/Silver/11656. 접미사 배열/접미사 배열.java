import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] arr = new String[s.length()];
        for(int i = 0 ; i < s.length() ; i++){
            arr[i] = s.substring(i,s.length()); // 배열에 저장
        }

        Arrays.sort(arr); // 사전순 정렬

        for(String ans : arr){// 출력
            System.out.println(ans);
        }

    }
}
