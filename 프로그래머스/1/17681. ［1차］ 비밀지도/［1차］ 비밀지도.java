import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        boolean [][] arr = new boolean[n][n];
        
        //arr1 지도
        for(int i = 0 ; i < n; i ++){
            String ar1 = Integer.toBinaryString(arr1[i]);
            String result1 = makeLength(ar1,n);
            String ar2 = Integer.toBinaryString(arr2[i]);
            String result2 = makeLength(ar2,n);
            
            for(int j = 0 ; j < n; j ++){
                if(result1.charAt(j) == '1'){
                    arr[i][j] = true;
                }
                if(result2.charAt(j) == '1'){
                    arr[i][j] = true;
                }
            }
        }
              
        for(int i = 0 ; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < n; j++){
                if(arr[i][j] == true){
                    sb.append("#");
                }else sb.append(" ");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
    
    private static String makeLength(String s,int n){
        StringBuilder sb = new StringBuilder();
        int cnt = s.length();
        
        while(cnt < n){
            sb.append("0");
            cnt++;
        }
        return sb.append(s).toString();
    }
}