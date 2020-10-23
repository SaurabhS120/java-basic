package sort_students;

public class Student implements Comparable<Student>{
    private int roll_no;
    private String name;
    private double percentage;

    public Student(int roll_no, String name, double percentage) {
        this.roll_no = roll_no;
        this.name = name;
        this.percentage = percentage;
    }
    public String toString(){
        String s="\n----------------------------------";
        s+="\nRoll no : "+roll_no;
        s+="\nName : "+name;
        s+="Precentage : "+percentage;
        s+="\n----------------------------------";
        return s;
    }
    public int compareTo(Student s){
        return roll_no-s.roll_no;
    }
}
