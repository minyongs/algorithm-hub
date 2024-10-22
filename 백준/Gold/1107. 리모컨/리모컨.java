
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[] broken = new boolean[10];

        if(m > 0){ // 만약 고장났을 때만 입력 받음(고장이 난게 없을 가능성도 o)
            String[] buttons = br.readLine().split(" ");
            for(String s : buttons){
                broken[Integer.parseInt(s)] = true; //10번까지의 버튼중 고장난 버튼들은 true
            }
        }


        int ans = Math.abs(n - 100); // 100부터 그냥 + , - 만으로 n을 만드는 경우의 수(이 값이 최댓값이므로 Math.min 으로 갱신해나가자)

        for(int i = 0 ; i <= 999999;i++){ //모든숫자를 다 확인
            String s = String.valueOf(i);

            if(isValid(s,broken)){ // 만약 그 버튼을 누를수 있다면,
                int pressCnt = s.length() + Math.abs(i - n); // 버튼을 누른 횟수 + n까지 + , - 로 조절해야 하는 값의 합
                ans = Math.min(ans,pressCnt); // 매번 최소값 갱신
            }
        }

        System.out.println(ans);
    }

    private static boolean isValid(String s,boolean[] broken){
        for(int i = 0 ; i < s.length(); i++){
            if(broken[s.charAt(i) - '0']){ // 하나라도 고장난 버튼이 있다면
                return false;
            }
        }
        return true;
    }
}
