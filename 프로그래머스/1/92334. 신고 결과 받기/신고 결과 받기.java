import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Map<String,Integer> reportedCnt = new HashMap<>(); //신고당한 횟수
        Map<String,HashSet<String>> whoReported = new HashMap<>(); //누가 누굴 신고했는지
        
        for(String s : id_list){ //초기화해버리자
            reportedCnt.put(s , 0);
            whoReported.put(s , new HashSet<>());
        }
        
        for(String s : report ){
            String[] arr = s.split(" ");
            String reporter = arr[0];
            String reported = arr[1];
            //만약 신고자가 이미 신고한 사람을 whoReported 에 가지고 있다면 신고 결과 추가 x
            if(!whoReported.get(reporter).contains(reported)){
                whoReported.get(reporter).add(reported); // 누가 누굴 신고했는지 저장
                reportedCnt.put(reported, reportedCnt.get(reported)+1); //신고 받은 횟수 갱신
            }
        }
        
        int[] ans = new int[id_list.length];
        
        List<String> gotBanMail = new ArrayList<>();
        //reportedCnt 를 돌며 밴당한사람 리스트 저장
        for(String key : reportedCnt.keySet()){
            if(reportedCnt.get(key)>=k){
                gotBanMail.add(key);
            }
        }
        
        //set 을 돌며 list 와 중복 찾기
        for(int i = 0 ; i < id_list.length; i++){
            int cnt = 0; 
            HashSet<String> set = whoReported.get(id_list[i]);
            
            for(String s : set){
                if(gotBanMail.contains(s)){
                    cnt++;
                }
                ans[i] = cnt;
            } 
        }
        return ans;
        
    }
}