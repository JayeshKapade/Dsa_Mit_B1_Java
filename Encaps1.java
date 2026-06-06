class Student{
    private int rollno;
    private String Name;
    private int age;
    private String course;

    int getrollno(){
        return this.rollno;
    }
    void setrollno(int rollno){
        this.rollno = rollno;
    }
    String getName(){
        return this.Name;
    }
    void setName(String Name){
        this.Name = Name;
    }
    int getage(){
        return this.age;
    }
    void setage(int age){
        this.age = age;
    }
    String getcourse(){
        return this.course;
    }
    void setcourse(String course){
        this.course = course;
    }

    void eat(){
        System.out.println("Student is eating");
    }
    void study(){
        System.out.println("Student is studying");
    }
}

public class Encaps1 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Jay");
        System.out.println(s1.getName());
    }
    
}
