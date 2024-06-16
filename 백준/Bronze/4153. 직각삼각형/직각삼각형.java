import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer[] arr = new Integer[3];

            for(int i = 0 ; i < 3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if(arr[0]==0 && arr[1]==0 &&arr[2] ==0){
                break;
            }

            Arrays.sort(arr,Collections.reverseOrder());

            int c = (arr[0] * arr[0]);
            int a = (arr[1] * arr[1]);
            int b= (arr[2] * arr[2]);

            if(c == a+b){
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }



        }

    }
}