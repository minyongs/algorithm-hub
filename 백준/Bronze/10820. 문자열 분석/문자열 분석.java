import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));




            while(true) { // 변수를 만들어서 Character 메서드로 검사 후 ++ 해줌
                String s = br.readLine(); 
                if(s==null){ // s 가 null 이면 loop 종료
                    break;
                }
                int low = 0;
                int up = 0;
                int digit = 0;
                int blank = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (Character.isAlphabetic(s.charAt(j)) && Character.isUpperCase(s.charAt(j))) {
                        up++;
                    } else if (Character.isAlphabetic(s.charAt(j)) && Character.isLowerCase(s.charAt(j))) {
                        low++;
                    } else if (Character.isDigit(s.charAt(j))) {
                        digit++;
                    } else {
                        blank++;
                    }
                }
                System.out.println(low + " " + up + " " + digit + " " + blank);
            }

    }



}
