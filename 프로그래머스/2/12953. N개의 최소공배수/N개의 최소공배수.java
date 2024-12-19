class Solution {
    public int solution(int[] arr) {
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            ans = lcm(ans,arr[i]); 
        }
        return ans;
    }
    
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}