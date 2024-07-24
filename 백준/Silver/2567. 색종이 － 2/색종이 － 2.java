import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] isColored = new boolean[101][101];

        int n = Integer.parseInt(br.readLine());
        int cnt = 0 ;
        for(int i = 0 ; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j = a; j <a+10; j++){
                for(int k = b ; k < b+10; k++){
                    if (!isColored[j][k]) {
                        isColored[j][k] = true;

                    }
                }
            }
        }
        int perimeter =0 ;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (isColored[i][j]) {

                    if (!isColored[i-1][j]) perimeter++;
                    if (!isColored[i+1][j]) perimeter++;
                    if (!isColored[i][j-1]) perimeter++;
                    if (!isColored[i][j+1]) perimeter++;
                }
            }
        }
        System.out.println(perimeter);

    }
}
