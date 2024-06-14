import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.contains("-")) {
            String[] arr = s.split("-");

            int min ;
            if(arr[0].contains("+")){
                min = sum(arr[0]);
            }else{
                min = Integer.parseInt(arr[0]);
            }


            for (int i = 1; i < arr.length; i++) {
                if (arr[i].contains("+")) {
                    min -= sum(arr[i]);
                } else {
                    min -= Integer.parseInt(arr[i]);
                }
            }

            System.out.println(min);
        }else{
            System.out.println(sum(s));
        }
    }

    public static int  sum(String s){
        int sum = 0;
        String[] arr = s.split("\\+");
        for(String num : arr){
            sum+=Integer.parseInt(num);
        }
        return sum;
    }
}
