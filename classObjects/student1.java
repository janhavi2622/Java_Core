package classesObjects;
class student{
    public int rollno;
    public String name;
    public String course;
    public int m1 ,m2 , m3;

    public int total(){
        return m1+m2+m3;
    }
    public float avg(){
        return total()/3;
    }
    public char grade(){
        if (avg()>=60)
        return 'A';
        else
        return 'B';
    }
    public String details(){
        return "Roll no:"+rollno+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }
}

public class student1 {
   public static void main(String[] args) {
    student s1=new student();
    s1.rollno=9;
    s1.name="janvi";
    s1.course="CSE";
    s1.m1=90;
    s1.m2=80;
    s1.m3=99;

    System.out.println(s1.total());
    System.out.println(s1.avg());
    System.out.println(s1.grade());
    System.out.println(s1.details());
   }
}

