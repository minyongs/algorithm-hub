import java.util.Scanner;

public class Main {

        static int n, m;
static int[][] computer;
static boolean[] visit;
static int count;

static void dfs(int x) {
    visit[x] = true; //

    for (int i = 1; i < n + 1; i++) {
        if (!visit[i] && computer[x][i] == 1) {
            dfs(i);
            count++;
        }
    }

}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    n = sc.nextInt(); // 컴퓨터 개수
    m = sc.nextInt(); // 1번컴퓨터와 연결된 컴퓨터

    computer = new int[n + 1][n + 1];
    visit = new boolean[n + 1];

    for (int i = 0; i < m; i++) {
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        computer[p1][p2] = computer[p2][p1] = 1; // 연결된 컴퓨터를 1로 초기화
    }

    dfs(1);
    System.out.println(count);

}

}
