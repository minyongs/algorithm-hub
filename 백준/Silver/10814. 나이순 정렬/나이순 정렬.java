import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//나이순 정렬
//실버 5
public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String [][] arr =new String[n][2];
        for(int i = 0 ; i <n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();

        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {

                    return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);

            }
        });
        for(int i = 0 ; i < n; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}