

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int kingRow;
    static int kingCol;
    static int rockRow;
    static int rockCol;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String kingPos = st.nextToken();
        String rockPos = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

         kingRow = 8 - (kingPos.charAt(1) - '0');
         kingCol = kingPos.charAt(0) -'A';
         rockRow = 8 - (rockPos.charAt(1) - '0');
         rockCol = rockPos.charAt(0) -'A';

        for(int i = 0 ; i < n; i++){
            String s = br.readLine();
            move(s);
        }

        System.out.println(convertToChess(kingRow,kingCol));
        System.out.println(convertToChess(rockRow,rockCol));


    }

    private static void move(String command) {
        int movedKingRow = kingRow;
        int movedKingCol = kingCol;


        switch (command) {
            case "B": // 아래
                movedKingRow++;
                break;
            case "T": // 위
                movedKingRow--;
                break;
            case "L": // 왼쪽
                movedKingCol--;
                break;
            case "R": // 오른쪽
                movedKingCol++;
                break;
            case "LB": // 왼쪽 아래
                movedKingRow++;
                movedKingCol--;
                break;
            case "LT": // 왼쪽 위
                movedKingRow--;
                movedKingCol--;
                break;
            case "RB": // 오른쪽 아래
                movedKingRow++;
                movedKingCol++;
                break;
            case "RT": // 오른쪽 위
                movedKingRow--;
                movedKingCol++;
                break;
        }

        // 왕과 돌이 같은 위치가 되면 돌을 같은 방향으로 이동
        if (movedKingRow == rockRow && movedKingCol == rockCol) {
            int movedRockRow = rockRow;
            int movedRockCol = rockCol;

            // 돌을 왕의 이동 방향과 같은 방향으로 이동시킴
            switch (command) {
                case "B":
                    movedRockRow++;
                    break;
                case "T":
                    movedRockRow--;
                    break;
                case "L":
                    movedRockCol--;
                    break;
                case "R":
                    movedRockCol++;
                    break;
                case "LB":
                    movedRockRow++;
                    movedRockCol--;
                    break;
                case "LT":
                    movedRockRow--;
                    movedRockCol--;
                    break;
                case "RB":
                    movedRockRow++;
                    movedRockCol++;
                    break;
                case "RT":
                    movedRockRow--;
                    movedRockCol++;
                    break;
            }

            // 돌이 이동할 위치가 보드 범위 내에 있는지 확인
            if (isInBounds(movedRockRow, movedRockCol)) {
                rockRow = movedRockRow;
                rockCol = movedRockCol;
            } else {
                // 돌이 범위를 벗어나면 왕을 이동  x
                return;
            }
        }

        // 왕이 체스판 안에 있는가 ?
        if (isInBounds(movedKingRow, movedKingCol)) {
            kingRow = movedKingRow;
            kingCol = movedKingCol;
        }
    }


    private static boolean isInBounds(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }

    private static String convertToChess(int row,int col){
        StringBuilder sb = new StringBuilder();
        char colChar = (char) ('A'+col);
        int rowNum = 8 - row;
        return sb.append(colChar).append(rowNum).toString();
    }

}
