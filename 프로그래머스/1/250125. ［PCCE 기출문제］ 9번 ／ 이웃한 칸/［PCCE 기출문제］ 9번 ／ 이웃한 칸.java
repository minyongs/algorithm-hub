class Solution {
    public int solution(String[][] board, int h, int w) {
        int cnt = 0;
        int n = board[0].length;
        int[] dh = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};
        // 1,2
        String s = board[h][w];
        for(int i = 0 ; i < 4; i++){
            int x = h + dh[i];
            int y = w + dy[i];
            if((x >= 0 && y >= 0) && (x < n && y < n)){
                if(board[x][y].equals(s)) cnt ++; 
            }
        }
        return cnt;
    }
}