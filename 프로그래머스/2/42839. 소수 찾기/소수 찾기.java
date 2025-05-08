import java.util.*;
class Solution {
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    
    public int solution(String numbers) {
        int len = numbers.length();
        visited = new boolean[len];
        
        
        dfs(numbers,"",0);
        
        int cnt = 0;
        for(int n : set){
            if(isPrime(n)) cnt ++;
        }
        
        return cnt;
    }
    
    private void dfs(String numbers, String current, int depth){
        
        if(depth == numbers.length() + 1) return;
        
        for(int i = 0; i < numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                
                String s = current + numbers.charAt(i);
                set.add(Integer.parseInt(s));
                
                dfs(numbers, s, depth + 1);
                
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int n){
        if(n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}