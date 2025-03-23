class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 45;
        for(int n : numbers){
            sum -= n;
        }
        return sum;
    }
}