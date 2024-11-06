import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int n, l;
    static int[][] arr;
    static int maxScore;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); // 재료의 개수
            l = Integer.parseInt(st.nextToken()); // 칼로리 제한

            arr = new int[n][2];

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken()); // 점수
                arr[j][1] = Integer.parseInt(st.nextToken()); // 칼로리
            }

            
            maxScore = 0;  
            calculate(0, 0, 0);  

            System.out.println("#" + i + " " + maxScore);
        }
    }

    public static void calculate(int idx, int score, int calories) {
        // 칼로리가 l을 초과하면 return
        if (calories > l) return;

        // 모든 재료를 탐색한 경우, 최대 점수 갱신
        if (idx == n) {
            maxScore = Math.max(maxScore, score);
            return;
        }

        // 이 재료를 선택하지 않는 경우
        calculate(idx + 1, score, calories);

        // 이 재료를 선택하는 경우
        calculate(idx + 1, score + arr[idx][0], calories + arr[idx][1]);
    }
}
