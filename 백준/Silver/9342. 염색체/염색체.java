import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//염색체
//실버3
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());
        List<String> answer = new ArrayList<>();
        String regex = "^[A-F]?A+F+C+[A-F]?$";

        for(int i = 0 ; i < n ; i ++){
            String s = br.readLine();
            if(s.matches(regex)){
                System.out.println("Infected!");
            }else{
                System.out.println("Good");
            }

        }
    }

}

