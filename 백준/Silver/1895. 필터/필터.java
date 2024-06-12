import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//필터
//실버4
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[][] images =new int[r][c];

        for(int i = 0; i < r; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < c; j++){
                images[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int t = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 0; i<=r-3; i++){
            for(int j = 0 ; j <=c-3;j++){

                List<Integer> list = new ArrayList<>(9);
                for(int i2 = 0; i2<3;i2++){
                    for(int j2 =0;j2<3;j2++){
                        list.add(images[i+i2][j+j2]);
                    }
                }
                if(findMiddleNum(list)>=t){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }

    public static int findMiddleNum(List<Integer> list){
        Collections.sort(list);
        return list.get(4);
    }
}
