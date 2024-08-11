import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int[] chess = {1,1,2,2,2,8};
        int[] ans = new int[6];
        for (int i = 0; i < 6; i++) {
        arr[i] = sc.nextInt();
        ans[i] = chess[i] - arr[i];
        }

        for(int i : ans){
            System.out.print(i +  " ");
        }

    }
}
