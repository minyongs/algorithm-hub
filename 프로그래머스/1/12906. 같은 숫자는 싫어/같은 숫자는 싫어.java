import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
     List<Integer> arrList = new ArrayList<>();
        
        arrList.add(arr[0]); //인덱스 0 미리 넣어두기
        
        for(int i = 1 ; i <arr.length; i++){
            
            if(arr[i] == arr[i-1]){//index i 가 i-1 과 같으면 pass
                continue;
            }else{
                arrList.add(arr[i]); //다르면 arrList에 추가
            }
 
        }
        //arrList 를 int 배열로 변환
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
       
            
        

        return answer;
    }
}
