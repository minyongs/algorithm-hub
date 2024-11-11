import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    // 나이트가 이동할 수 있는 8가지 방향
    static int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
    static int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

    //6x6 체스판
    static boolean[][] visited = new boolean[6][6];
    
    // 시작 위치를 저장
    static int startX, startY;
    // 이전 위치를 저장
    static int prevX, prevY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 위치 입력
        String startPos = br.readLine();
        // 시작 위치의 X, Y 좌표 계산 (체스판 좌표를 배열 인덱스로 변환)
        startX = startPos.charAt(0) - 'A';
        startY = startPos.charAt(1) - '1';
        
        // 현재 위치를 이전 위치로 설정
        prevX = startX;
        prevY = startY;
        
        // 첫 번째 위치 방문 표시
        visited[startX][startY] = true;
        
        // 모든 경로가 유효한지 확인하는 flag
        boolean isValid = true;

     
        for (int i = 1; i < 36; i++) {
            String pos = br.readLine();
            int currX = pos.charAt(0) - 'A';
            int currY = pos.charAt(1) - '1';

            // 현재 위치가 이전 위치에서 나이트 이동으로 도달 가능한지 확인
            if (!isKnightMove(prevX, prevY, currX, currY) || visited[currX][currY]) {
                isValid = false; // 유효하지 않은 경로가 있으면 false로 설정
                break;
            }

            // 방문 표시 및 이전 위치 업데이트
            visited[currX][currY] = true;
            prevX = currX;
            prevY = currY;
        }

        // 마지막 위치와 시작 위치가 연결될 수 있는지 확인
        if (!isKnightMove(prevX, prevY, startX, startY)) {
            isValid = false;
        }

        
        System.out.println(isValid ? "Valid" : "Invalid");
    }

    // 나이트가 이동할 수 있는 위치인지 확인하는 메서드
    private static boolean isKnightMove(int x1, int y1, int x2, int y2) {
        for (int i = 0; i < 8; i++) {
            int nx = x1 + dx[i];
            int ny = y1 + dy[i];
            // 이동 가능 위치라면 true 반환
            if (nx == x2 && ny == y2) {
                return true;
            }
        }
        return false; // 이동 불가능한 위치라면 false 반환
    }
}
