import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                arr[i][j] = c;
            }
        }
        int rowCnt = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '.') {
                    cnt++;
                } else if ( arr[i][j] == 'X') {
                    if(cnt>=2){
                        rowCnt++;
                    }
                    cnt = 0;
                }
            }
            if (cnt >= 2) {
                rowCnt++;
            }
        }
        int colCnt =0;
        for (int j = 0; j < n; j++) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == '.') {
                    cnt++;
                } else if ( arr[i][j] == 'X') {
                    if(cnt>=2){
                        colCnt++;
                    }
                    cnt = 0;
                }
            }
            if (cnt >= 2) {
                colCnt++;
            }
        }

        System.out.println(rowCnt +" "+colCnt);
    }
}
