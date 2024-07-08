import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr ={"c=","c-","dz=","d-","lj","nj","s=","z="};
        String s = br.readLine();
        int cnt = 0;
       for(int i = 0 ; i < 8; i++){
           if(s.contains(arr[i])){
               s= s.replaceAll(arr[i],"*");
           }
       }
        System.out.println(s.length());
    }
}
