

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++){
            map.put(Character.toUpperCase(s.charAt(i)),map.getOrDefault(Character.toUpperCase(s.charAt(i)),0)+1);
        }
        
        int maxVal = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            maxVal = Math.max(maxVal,entry.getValue());
        }
        List<Character> list = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(map.get(entry.getKey()) == maxVal){
                list.add(entry.getKey());
            }
        }

        if(list.size() == 1) System.out.println(list.get(0));
        else System.out.println("?");
    }
}
