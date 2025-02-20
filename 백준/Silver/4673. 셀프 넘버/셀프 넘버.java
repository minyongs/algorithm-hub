

public class Main {
    public static void main(String[] args) {
        selfNumber();

    }

    public static void selfNumber(){
        boolean[] selfNum = new boolean[10001];

        for(int i = 1; i < 10000; i++){
            int n = calculate(i);
            if(n < 10000) {
                selfNum[n] = true;
            }
        }

        for(int i = 1; i < 10000; i++){
            if(!selfNum[i]){
                System.out.println(i);
            }
        }
    }

    public static int calculate(int n){
        String num = String.valueOf(n);
        char[] toChar = num.toCharArray();
        int sum = 0;
        for(char c : toChar){
            sum += c - '0';
        }
        return sum + n;
    }
}
