import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            list.add(br.readLine());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    if(sum(o1)==sum(o2)){
                        return o1.compareTo(o2);
                    }
                    return sum(o1)-sum(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for(String s : list){
            System.out.println(s);
        }


    }

    public static int sum(String s){
        int sum = 0 ;
        char[] array= s.toCharArray();
        for(char c : array){
            if(Character.isDigit(c)){
                sum+=c-'0';
            }
        }
        return sum;
    }
}
