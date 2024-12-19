import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
    String strNum = Integer.toString(n); // 정수를 문자열로 변환
        int[] arr = new int[strNum.length()]; // strNum 의 길이만큼의 int 형 배열 생성
        for(int i = 0; i < strNum.length();i ++){
            arr[i]  = strNum.charAt(i) - '0'; //charAt을 사용하여 인덱스 위치를 지정하고, - '0' int 로 변환
            answer += arr[i];        }
        
        // 오류해결 : toString() 으로 변환 후 생성된 문자열의 길이는 strNum.length() 처럼 괄호가 꼭 붙어있어야 한다!
       
        return answer;
    }
}