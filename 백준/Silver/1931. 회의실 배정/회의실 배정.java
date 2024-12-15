

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];

        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]); 
            }
            return Integer.compare(a[1], b[1]);
        });
        
        int cnt = 0;
        int lastTime = 0;
        for(int[] a : time){ //2차원 배열의 배열을 하나씩 순회하면서
            if(a[0] >= lastTime){ //만약 시작시간이 전 배열의 끝시간보다 크거나 같으면
                cnt ++; //배치 가능
                lastTime = a[1];
            }
        }

        System.out.println(cnt);
    }
}
