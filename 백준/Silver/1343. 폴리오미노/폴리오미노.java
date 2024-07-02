import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        String a = s.replaceAll("XXXX","AAAA");
        String b = a.replaceAll("XX","BB");

        int x = b.indexOf("X");
        if(x != -1){
            System.out.println(-1);
        }else{
            System.out.println(b);
        }






    }
}
