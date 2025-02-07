class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 != 0){
                food[i] -= 1;
            }
            food[i] /= 2;
            
            for(int j = 0 ; j < food[i]; j++){
                sb.append(i);
            }
        }
        
        String reversed = sb.reverse().toString();
        return sb.reverse().append("0").append(reversed).toString();
    }
}