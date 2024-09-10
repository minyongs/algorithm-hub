import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int zeroCnt = 0 ;
        int oneCnt = 0;

        if(s.charAt(0)=='0'){
            zeroCnt++;
        }else{
            oneCnt++;
        }

        for(int i = 1 ; i < s.length();i++){
            if(s.charAt(i)=='0' && s.charAt(i-1) != '0'){
                zeroCnt++;
            }else if(s.charAt(i)=='1' && s.charAt(i-1) != '1'){
                oneCnt++;
            }
        }
        int ans ;
        if((zeroCnt == 1 && oneCnt ==0) || (zeroCnt == 0 && oneCnt ==1)){
            ans = 0;
        }else{
            ans = Math.min(zeroCnt,oneCnt);
        }
        System.out.println(ans);
    }
}
