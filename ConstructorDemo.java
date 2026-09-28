class Student{
    int rollNo;
    String name;

    //default constructor
    Student(){
        rollNo = 0;
        name="Unknown";

    }

    //parameterized constructor
    Student(int rollNo,String name){
        this.rollNo= rollNo;
        this.name= name;
    }
    void display(){
        System.out.println(rollNo + " "+ name);
    }
}

public class ConstructorDemo {
public static void main(String[] args) {
    Student s1=new Student();
    Student s2=new Student(101, "Arpita");

    s1.display();
    s2.display();
}    
}
