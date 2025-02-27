class Solution {
    public int solution(int a, int b, int n) {
        
        int totalCola = 0;
        int emptyBottles = n;
        
        while (emptyBottles >= a) {
            int newCola = (emptyBottles / a) * b;
            totalCola += newCola;
               
            emptyBottles = (emptyBottles % a) + newCola;
        }
        
        return totalCola;
    }
}