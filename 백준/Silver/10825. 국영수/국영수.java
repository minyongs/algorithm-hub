import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Student> list = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Student student = new Student(st.nextToken(),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            list.add(student);
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.kor == o2.kor){
                    if(o1.eng==o2.eng){
                        if(o1.math == o2.math){
                            return o1.name.compareTo(o2.name);
                        }
                        return -(o1.math-o2.math); // 내림차순
                    }
                    return o1.eng-o2.eng; // 오름차순
                }
                return -(o1.kor-o2.kor);
            }
        });

        for(Student student : list){
            System.out.println(student.name);
        }


    }
}

 class Student{
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name,int kor,int eng,int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

