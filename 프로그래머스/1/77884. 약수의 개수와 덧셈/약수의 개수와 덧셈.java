class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int sum = 0;
        for(int i = left; i <=right; i++){
            if(howMany(i)%2 == 0){
                sum += i;
            }else{
                sum -=i;
            }
        }
        return sum;
    }
    
    public static int howMany(int num){
        int howMany =1;
        int cnt = 0;
        
        for(int i = 2; i<=num;i++){
            while(num % i ==0){
            cnt++;
            num = num/i;
        }
        howMany *= (cnt +1);
            
        }
        return howMany;
        
    }
}