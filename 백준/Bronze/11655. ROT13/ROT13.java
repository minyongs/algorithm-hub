import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String s = br.readLine();
        StringBuilder sb = new StringBuilder();


        for(int i = 0 ; i < s.length();i++) {
            if(Character.isAlphabetic(s.charAt(i)) && Character.isUpperCase(s.charAt(i))){ // 알파벳이고 대문자일때
                int a = s.charAt(i) + 13; //아스키 넘버에서 13 밀기
                if(a>90){ //만약 90 을 넘어가면 Z 를 넘어갔다는 의미이므로
                    a -= 26; // 26 빼서 돌려주기
                }
                sb.append((char)a); //캐스팅 해서 저장
            }else if(Character.isAlphabetic(s.charAt(i)) && Character.isLowerCase(s.charAt(i))){ // 알파벳이고 소문자일때
                int a = s.charAt(i) + 13;
                if(a>122){
                    a-=26;
                }
                sb.append((char)a);
            }else{
                sb.append(s.charAt(i));
            }

        }
        System.out.println(sb.toString());

    }
}
