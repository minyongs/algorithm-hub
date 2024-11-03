
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;        // 능력치 배열
    static boolean[] team;     // 팀 분할 상태 저장
    static int minDiff = Integer.MAX_VALUE; // 최소 능력치 차이를 저장할 변수
    static int n;              // 인원 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        team = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backtrack(0, 0);
        System.out.println(minDiff); // 최소 능력치 차이 출력
    }

    private static void backtrack(int start, int cnt) {
        if (cnt >= 1) {  // 팀에 최소 1명 이상이 포함될 때 능력치 차이 계산
            calculate();
        }
        if (cnt == n) {  // 모든 사람을 탐색한 경우 종료
            return;
        }

        for (int i = start; i < n; i++) {
            if (!team[i]) {
                team[i] = true;         // i번째 사람을 첫 번째 팀에 배치
                backtrack(i + 1, cnt + 1); // 다음 사람으로 진행
                team[i] = false;        // 백트래킹 - 다시 원래 상태로
            }
        }
    }

    private static void calculate() {
        int start = 0;
        int link = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (team[i] && team[j]) {         // 둘 다 첫 번째 팀일 경우
                    start += arr[i][j] + arr[j][i];
                } else if (!team[i] && !team[j]) { // 둘 다 두 번째 팀일 경우
                    link += arr[i][j] + arr[j][i];
                }
            }
        }
        // 최소 능력치 차이 업데이트
        minDiff = Math.min(minDiff, Math.abs(start - link));
    }
}
