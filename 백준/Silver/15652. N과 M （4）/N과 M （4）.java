
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();  // 출력 결과를 저장할 StringBuilder
    static int n, m;  // n: 최대 숫자, m: 고를 숫자의 개수
    static boolean[] visit;  // 방문 여부를 체크할 배열
    static int[] arr;  // 선택한 숫자를 저장할 배열

    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());  // N 값
        m = Integer.parseInt(st.nextToken());  // M 값


        visit = new boolean[n + 1];
        arr = new int[m + 1];


        dfs(1,1);
        System.out.print(sb);
    }


    private static void dfs(int depth,int start) {
        // M개의 숫자를 모두 선택한 경우
        if (depth == m + 1) {

            for (int i = 1; i <= m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 1부터 N까지의 숫자를 돔 ->중복 선택을 허용하므로 visit 체크 필요 x
        for (int i = start; i <= n; i++) {
            arr[depth] = i;  // 선택한 숫자를 현재 깊이에 저장
            dfs(depth + 1 , i);  // 다음 깊이로 이동
        }
    }
}
