

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //TC 개수

        for(int i = 1 ; i <= T; i++){
            LinkedList<Character> list = new LinkedList<>();
            String s = br.readLine();

            for(int j = 0 ; j < s.length(); j++){
                char c = s.charAt(j);
                if(list.contains(c)){
                    list.remove((Character) c);
                }else{
                    list.add(c);
                }
            }
            String ans = "Good";
            StringBuilder sb = new StringBuilder();
            if(!list.isEmpty()){
                Collections.sort(list);
                for(Character c : list){
                    sb.append(c);
                }
                ans = sb.toString();
            }

            System.out.println("#"+ i +" "+ ans);
        }
    }


}
