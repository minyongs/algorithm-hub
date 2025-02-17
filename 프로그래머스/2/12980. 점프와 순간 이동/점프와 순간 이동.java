import java.util.*;

public class Solution {
    public int solution(int n) {
     // n부터 시작
        int cnt = 0;
        while(n != 0){
            if(n % 2 != 0){
                n-- ;
                cnt ++;
            }else{
                n /= 2;
            }
        }
        return cnt;
    }
}