import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Person{
    public String name;
    public int day;
    public int month;
    public int year;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Person[] people = new Person[n];
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            people[i] = new Person(st.nextToken(),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.year == o2.year){
                    if(o1.month == o2.month){
                       return o1.day-o2.day;
                    }
                    return o1.month-o2.month;
                }
                return o1.year-o2.year;
            }
        });

        System.out.println(people[people.length-1].name);
        System.out.println(people[0].name);

       
    }
}
