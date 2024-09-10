import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n; i++){
            int[] arr = new int[5];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 5; j++) {
              arr[j] = Integer.parseInt(st.nextToken());
            }
            int num = findMaxLastDigit(arr);
           map.put(i+1,num);
        }

        int winner = findWinner(map);
        System.out.println(winner);


    }

    private static int findMaxLastDigit(int[] arr){
        int maxLastDigit = 0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                for(int k = j+1; k<arr.length; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    int lastDigit = sum % 10 ;

                    if(lastDigit>maxLastDigit){
                        maxLastDigit = lastDigit;
                    }
                }
            }
        }
        return maxLastDigit;
    }

    private static int findWinner(HashMap<Integer,Integer> map){
        int max = 0;
        int winner = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max || (entry.getValue() == max && entry.getKey()>winner)){
                max = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }
}
