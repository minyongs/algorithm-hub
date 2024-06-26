import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cash = Integer.parseInt(br.readLine());
        int[] price = new int[14]; //주가
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 14; i++){
            price[i] = Integer.parseInt(st.nextToken());
        }

        int leftMoney = cash ;
        int stock =0;
        //준현이 투자법
        for(int i = 0 ; i < 14; i++) {
            //남은 돈이 주가보다 크거나 같으면
            if(leftMoney>=price[i]){
                stock += (leftMoney/price[i]);
                leftMoney = (leftMoney%price[i]);
            }
        }
        int jun = leftMoney +(price[13]*stock );

        //성민이 투자법

        int leftMoney2 = cash;
        int stock2 = 0;


        for(int i = 0; i < 11; i++) {
            // 가격이 3번 연속 상승하면 전량 매도
            // 가격이 3번 연속 하락하면 전량 매수
            if (price[i] < price[i + 1] && price[i + 1] < price[i + 2] && price[i+2]<price[i+3]) {
                leftMoney2 += price[i+3] * stock2;
                stock2= 0;
            }else if(price[i] > price[i + 1] && price[i + 1] > price[i + 2] && price[i+2]>price[i+3]){
                if(leftMoney2 > price[i+3]){
                    stock2 += leftMoney2/price[i+3];
                    leftMoney2 = leftMoney2 % price[i+3];

                }
            }

        }

// 최종 자산 계산
        int sung = leftMoney2 + (stock2 * price[13]);


       




        String ans;

        if(jun == sung){
            ans = "SAMESAME";
        }else{
            ans = jun>sung?"BNP":"TIMING";
        }

        System.out.println(ans);





    }
}
