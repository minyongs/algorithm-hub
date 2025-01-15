import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int stick = 64;
        int cnt = 0;
       

        while(x>0){
            if( stick<= x){  //나뉜 막대가 x보다 작으면
                x -= stick; // x 에서 막대기 빼줌
                cnt ++ ; //카운트
            }

            if(x == 0 ){ // x 가 0 이면
                break; //끝
            }
            stick /= 2;  // 막대기를 2 로 나눔
        }

        System.out.println(cnt);



    }
}

