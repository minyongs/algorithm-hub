import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = sol(n,k);

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 0 ; i < list.size();i++){
            sb.append(list.get(i)+", ");
        }
        sb.replace(sb.length()-2,sb.length()-1,">");
        System.out.println(sb.toString());


    }
    public static ArrayList<Integer> sol(int n , int k){
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer>  ans = new ArrayList<>();
        for(int i = 1 ; i <= n; i++){
            list.add(i);
        }
        int idx = 0 ;
        while(!list.isEmpty()){
            idx = (idx + k-1) % list.size();
            ans.add(list.get(idx));
            list.remove(idx);
        }

        return ans;
    }
}
