import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int num = 666;
        while (true){
            if(cnt == n){
                break;
            }
            num++;
            String s = String.valueOf(num);
            if(s.contains("666")){
                cnt++;
            }

//            int countSix = 0 ;
//            char[] charArr = String.valueOf(num).toCharArray();
//            int[] intArr = new int[charArr.length];
//            for(int i = 0 ; i < charArr.length;i++){
//                intArr[i] = charArr[i] -'0';
//                if(intArr[i] == 6){
//                    countSix++;
//                }else if(countSix >1 && intArr[i] != 6){
//
//                }
//            }
//
//            if(countSix ==3)
//                cnt++;


        }
        System.out.println(num);

    }
}