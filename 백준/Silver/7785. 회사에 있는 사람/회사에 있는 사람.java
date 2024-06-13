import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//실버 5
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0 ; i < n; i++){
            StringTokenizer st=  new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String isHere = st.nextToken();

            if (isHere.equals("enter")) {
                set.add(name);
            } else if (isHere.equals("leave")) {
                set.remove(name);
            }


        }


        for(String s : set){
            System.out.println(s);
        }



    }
}
