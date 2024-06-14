import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        //1 2 3 4 5 6 7
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n; i++) {
            list.add(i+1);
        }


        int index = 0;
        while (!list.isEmpty()) {
            index = (index + k - 1) % list.size();
            ans.add(list.remove(index));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i : ans){
            sb.append(i+", ");
        }
        sb.replace(sb.length()-2,sb.length()-1,">");

        System.out.println(sb.toString());

    }

}
