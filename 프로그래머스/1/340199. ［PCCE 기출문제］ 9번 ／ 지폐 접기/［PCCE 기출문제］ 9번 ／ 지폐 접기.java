class Solution {
    public int solution(int[] wallet, int[] bill) {
        int cnt = 0;
        
        while(true){
            if(check(wallet,bill)) break;
            else{
                if(bill[0] > bill[1]) bill[0] /=2;
                else bill[1] /= 2;
                
                cnt ++;
            }
        }
        return cnt;

    }
    
    private static boolean check(int[] wallet, int[] bill){
        if((bill[0] <= wallet[0]) && (bill[1] <= wallet[1]) || (bill[0] <= wallet[1]) && (bill[1] <= wallet[0])) return true;
        
        return false;
    }
}