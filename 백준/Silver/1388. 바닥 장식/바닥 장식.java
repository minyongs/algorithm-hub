
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i][0] == '-') cnt++;
            for (int j = 1; j < M; j++) {
                if (arr[i][j] == '-' && arr[i][j] != arr[i][j - 1]) cnt++;
            }
        }

        for(int i = 0; i < M; i++){
            if(arr[0][i] == '|') cnt++;
            for(int j = 1; j < N; j++){
                if(arr[j][i] == '|' && arr[j][i] != arr[j-1][i]) cnt++;
            }
        }

        System.out.println(cnt);
    }
}

