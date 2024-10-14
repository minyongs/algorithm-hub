
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Dungchi[] arr = new Dungchi[n];
        int[] ans = new int[n];
        Arrays.fill(ans,1);
        for(int i = 0 ; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Dungchi dungchi = new Dungchi(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            arr[i] = dungchi;
        }
        for(int i = 0 ; i < n - 1; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[i].height > arr[j].height && arr[i].weight >arr[j].weight){
                    ans[j]++;
                }else if(arr[i].height < arr[j].height && arr[i].weight < arr[j].weight){
                    ans[i]++;
                }
            }
        }

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}

class Dungchi{
    int height;
    int weight;

    public Dungchi(int weight,int height){
        this.weight = weight;
        this.height = height;
    }
}
