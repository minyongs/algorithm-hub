
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        boolean flag = true;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(A);
        while(flag){
            int num = make(A,P);
            if(!set.add(num)){
                flag = false;
            }
            A = num;
        }
        int num2 = A;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            if(num2 == it.next()){
                it.remove();
                break;
            }
        }
        while (it.hasNext()){
            it.next();
            it.remove();
        }

        System.out.println(set.size());
    }

    private static int make(int a,int p){
        char[] arr = String.valueOf(a).toCharArray();
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            int num = arr[i] - '0';
            sum += (int) Math.pow(num,p);
        }
        return sum;
    }

}

