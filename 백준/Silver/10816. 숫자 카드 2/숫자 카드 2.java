import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for(int i = 0 ; i < m; i++){
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < m ; i++){
            sb.append(upper(arr, arr2[i]) - lower(arr, arr2[i])).append(" ");
        }

        sb.deleteCharAt(sb.length()-1);

        System.out.println(sb.toString());


    }

    public static int lower(int[] arr,int a){
        int start = 0;
        int end = arr.length;
        int mid;

        while (start<end){

            mid = (start+end)/2;
            if(a<=arr[mid]){
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }

    public static int upper(int[] arr,int a){
        int start = 0;
        int end = arr.length;
        int mid;

        while (start<end){

            mid = (start+end)/2;
            if(a<arr[mid]){
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }


}
