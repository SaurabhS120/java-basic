package sort_students;
import java.util.Arrays;
import java.util.Vector;

public class SortStudents {
    public static void main(String[] args) {
        Vector<Student> v=new Vector<Student>();
        v.add(new Student(5,"asdc",82));
        v.add(new Student(9,"vnjnv",35));
        v.add(new Student(2,"gfdvc",76));
        Student[] students=Arrays.copyOf(v.toArray(),v.size(),Student[].class);
        Arrays.sort(students);
        for(Student s:students){
            System.out.println(s);
        }

    }
}
