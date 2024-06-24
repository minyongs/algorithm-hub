import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 체스판 패턴 1 (W로 시작)
        String[][] board1 = {
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"}
        };

        // 체스판 패턴 2 (B로 시작)
        String[][] board2 = {
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"}
        };

        String[][] arr = new String[n][m];

        for(int i = 0 ; i < n; i ++){
            String line = br.readLine();
            for(int j = 0; j < m ; j++){
                arr[i][j] = Character.toString(line.charAt(j));
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <=n-8; i++){
            for(int j = 0 ; j <= m -8; j++){

                int cnt1 = 0; // board1 패턴과 비교
                int cnt2 = 0; // board2 패턴과 비교
                for(int i2=0; i2<8;i2++){
                    for(int j2=0; j2<8;j2++){
                        if(!arr[i+i2][j+j2].equals(board1[i2][j2])){
                            cnt1++;
                        }
                        if(!arr[i+i2][j+j2].equals(board2[i2][j2])){
                            cnt2++;
                        }
                    }
                }
                min = Math.min(min, Math.min(cnt1, cnt2));
            }
        }
        System.out.println(min);
    }
}
