import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//문자열 반복
public class Main {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < t; i++){
            int r = sc.nextInt();
            String s = sc.next();

            StringBuilder sb = new StringBuilder();

            for(int j = 0 ; j <s.length(); j++){
                for(int k = 0 ; k < r; k++){
                    sb.append(s.charAt(j));
                }
            }

            list.add(sb.toString());

        }

        for(String s : list){
            System.out.println(s);
        }

    }
}
