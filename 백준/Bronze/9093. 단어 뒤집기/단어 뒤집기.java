import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++){
            String sentence = br.readLine();
            System.out.println(flipSentence(sentence));
        }


    }

    private static String flipSentence(String sentence){
        String[] words = sentence.split(" "); // 공백을 기준으로 문장을 나눠서 배열에 단어 하나씩 저장
        StringBuilder sb = new StringBuilder(); //다시 문장으로 만들기 위한 StringBuilder 객체 생성

        for(int i = 0 ; i < words.length; i++) {
            sb.append(flipWord(words[i])); // 단어마다 뒤집어서 StringBuilder 에 append
            sb.append(" "); // 추가할때마다 공백이 있다는 의미이기 때문에 공백 추가
        }
        sb.deleteCharAt(sb.length()-1); // 마지막에 불필요한 공백이 하나 더 생길수 있으므로 sb.length-1 인덱스의 공백을 삭제

        return sb.toString();
    }

    private static String flipWord(String word){ // 단어를 뒤집는 메서드
        StringBuilder sb = new StringBuilder(word); //word 매개변수로 StringBuilder 객체 생성
        return sb.reverse().toString(); // 뒤집어버려
    }

}
