class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] phoneNum = phone_number.toCharArray(); // toCharArray를 사용하여 문자열을 char 배열로 바로 저장
        for (int i = 0 ; i < phoneNum.length-4; i++){
            
            phoneNum[i] = '*';
            
        }
        return new String(phoneNum); // String(문자열)은 직접 수정이 불가능! 따라서 배열로 옮긴뒤 수정하고,다시 문자열로 변환해야함 
    }
}