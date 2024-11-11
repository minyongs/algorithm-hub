import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
       
        //약관을 저장하는 map
        HashMap<String,Integer> termsMap = new HashMap<>();
        
        
        //map 에 저장
        for (String term : terms) {
            String[] termSplit = term.split(" ");
            String type = termSplit[0];      // 약관 종류
            int months = Integer.parseInt(termSplit[1]); // 유효 개월수
            termsMap.put(type, months);
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            String startDate = privacy[0]; // 개인정보 수집 날짜
            String termType = privacy[1];  // 약관 종류
            
            // 약관의 유효 개월수를 일수로 
            int termDays = termsMap.get(termType) * 28; 
            
            // 오늘 날짜와 수집 날짜 간의 일수 차이 계산
            int difference = calculateDifference(today, startDate);

            // 일수 차이가 유효기간보다 크거나 같으면 만료 처리
            if (difference >= termDays) {
                ans.add(i + 1); // 만료된 항목의 인덱스 추가 (1부터 시작)
            }
        }
        int[] answer = new int[ans.size()];
        for(int i = 0 ; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }
        
        return answer;
        
         
    }
    
    static int calculateDifference(String today, String registered) {
        
        String[] todayArr = today.split("\\.");
        String[] registeredArr = registered.split("\\.");
        
        // 년, 월, 일을 각각 일수로 변환하여 차이 계산
        int yearDifference = (Integer.parseInt(todayArr[0]) - Integer.parseInt(registeredArr[0])) * 12 * 28;
        int monthDifference = (Integer.parseInt(todayArr[1]) - Integer.parseInt(registeredArr[1])) * 28;
        
        if (monthDifference < 0) {
            yearDifference -= 12 * 28;
            monthDifference += 12 * 28;
            }
        
        int dayDifference = Integer.parseInt(todayArr[2]) - Integer.parseInt(registeredArr[2]);
            if (dayDifference < 0) {
            monthDifference -= 28;
            dayDifference += 28;
            }
        // 총 일수 차이 반환
        return yearDifference + monthDifference + dayDifference;
    }

}