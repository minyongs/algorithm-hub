import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();
            for(int j = 0 ; j < a; j++){
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);
            int largestGap = 0 ;
            for(int k = 0; k<a-1;k++){
                int dif = list.get(k+1)-list.get(k);
                largestGap = Math.max(largestGap,dif);
            }
            System.out.println("Class "+(i+1));
            System.out.println("Max "+list.get(list.size()-1)+", Min "+list.get(0)+", Largest gap "+largestGap);

        }
    }
}
