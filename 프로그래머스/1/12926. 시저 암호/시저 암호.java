class Solution {
    public String solution(String s, int n) {
        String answer = password(s,n);
        return answer;
    }
    
    //2칸 밀어서 나오는 알파벳 ex > AB -> BC
    // z를 1 밀면 a
 public static String password(String s,int n) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
        if (c >= 'a' && c <= 'z') {
            sb.append((char) ((c - 'a' + n) % 26 + 'a'));
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A' + n) % 26 + 'A'));
        } else {
            sb.append(c); // 알파벳이 아닌 문자는 그대로 추가
        }
    }
    return sb.toString();
}
}