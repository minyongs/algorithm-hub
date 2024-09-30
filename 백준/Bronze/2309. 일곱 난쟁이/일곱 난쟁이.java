import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9]; //입력받을 배열
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        for(int i = 0 ; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            ans.add(arr[i]);
            sum += arr[i];
        }

        for(int i = 0 ; i <8; i++){
            for(int j = i+1; j <9; j++){
                if(sum - arr[i] - arr[j] == 100){
                    ans.remove(Integer.valueOf(arr[i]));
                    ans.remove(Integer.valueOf(arr[j]));
                    break;
                }
            }
            if(ans.size()==7) break;
        }

        Collections.sort(ans);

        for(int i : ans){
            System.out.println(i);
        }


    }
}
