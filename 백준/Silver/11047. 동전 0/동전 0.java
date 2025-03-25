import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt= 0;
        Integer[] arr = new Integer[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();

        }

        Arrays.sort(arr, Collections.reverseOrder()); //

        for(int i = 0 ; i < n; i ++){
            if(arr[i]>k){
                continue;
            }else{
                cnt += k / arr[i] ;
                k %=  arr[i];
            }
        }
        System.out.println(cnt);

    }



}
