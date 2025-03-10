class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0; 
        
        for(int i = 1; i<=count;i++){
            int newPrice = i * price;
            sum+= (long)newPrice; 
        }
        
        if(money>sum){
            return 0;
        }else
        return sum -money;
    }
}