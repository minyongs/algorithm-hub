import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int sum = 0;
        int length = A.length;
        
        for(int i = 0,j = length-1; i < length && j>=0; i++,j--){
            sum += A[i] * B[j];
        }
        
        return sum;
    }
}