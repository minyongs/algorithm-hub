import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }

        int t = sc.nextInt();
        int p = sc.nextInt();
        int Tcnt = 0;

        for (int i = 0; i < list.size(); i++) {
            Tcnt += list.get(i) / t;
            if (list.get(i) % t > 0) {
                Tcnt++;
            }
        }

        int penCnt = n / p;
        int penLeft = n % p;

        System.out.println(Tcnt);
        System.out.print(penCnt + " " + penLeft);

        sc.close();
    }
}
