import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] arr = new char[n][n];

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                
                if(arr[i][j] != arr[i][j + 1]){
                    swap(arr, i, j, i, j + 1);
                    ans = Math.max(ans, check(arr));
                    swap(arr, i, j, i, j + 1); 
                }

                
                if(arr[j][i] != arr[j + 1][i]){
                    swap(arr, j, i, j + 1, i);
                    ans = Math.max(ans, check(arr));
                    swap(arr, j, i, j + 1, i); 
                }
            }
        }

        System.out.println(ans);
    }

    public static void swap(char[][] arr, int x1, int y1, int x2, int y2){
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    public static int check(char[][] arr){
        int n = arr.length;
        int max = 1;

        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = 0; j < n - 1; j++){
                if(arr[i][j] == arr[i][j + 1]){
                    cnt++;
                } else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
        }

        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = 0; j < n - 1; j++){
                if(arr[j][i] == arr[j + 1][i]){
                    cnt++;
                } else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
        }

        return max;
    }
}
