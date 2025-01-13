import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//듣보잡
//실버 4
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

       HashSet<String> set = new HashSet<>();

       for(int i =0 ; i < a;i++){
           set.add(br.readLine());
       }

       List<String> ans = new ArrayList<>();

       for(int i = 0 ; i <b;i++){
           String temp = br.readLine();
           if(set.contains(temp)){
               ans.add(temp);
           }
       }

       Collections.sort(ans);

        System.out.println(ans.size());
        for (String s : ans){
            System.out.println(s);
        }



    }
}
