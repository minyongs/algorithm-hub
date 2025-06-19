import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        double[] failArr = new double[N + 1];
        
        for(int i = 0 ; i < N; i ++){
            // 각 스테이지별 도전자 구하기(스테이지와 같거나 크면 cnt)
            int doJun = 0;
            int failed = 0;
            int stage = i + 1;
            for(int j = 0 ; j < stages.length; j++){
                if(stages[j] >= stage) doJun++;
                if(stages[j] == stage) failed++;
             }
            
            if(doJun > 0){
            double failRate = (double)failed / doJun;
            failArr[stage] = failRate;
            }else failArr[stage] = 0;
        }
        
        Map<Integer,Double> map = new HashMap<>();
        for(int i = 1; i <= N; i++){
            map.put(i,failArr[i]);
        }
        
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()));
    
        int[] ans = new int[N];
        
        for(int i = 0 ; i < N; i++){
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}