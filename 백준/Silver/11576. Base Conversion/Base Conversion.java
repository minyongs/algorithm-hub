

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 미래세계에서 사용하는 진법
        int B = Integer.parseInt(st.nextToken()); // 정이가 사용하는 진법
        int m = Integer.parseInt(br.readLine()); // A진법의 자리수
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int dec = toDecimal(arr,A);
        System.out.println(convert(dec,B));

    }

    private static int toDecimal(int[] arr,int A){
        int sum = 0 ;
        for(int i = 0,j=arr.length-1;i<arr.length && j>=0; i++,j--){
            sum+= arr[i] * (int)Math.pow(A,j);
        }

        return sum;
    }

    private static String convert(int dec,int B){
        if (dec == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        while(dec != 0){
            int left = dec % B ;
            sb.insert(0,left+" ");
            dec /= B;
        }
        return sb.toString().trim();
    }
}
