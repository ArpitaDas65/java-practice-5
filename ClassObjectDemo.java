class Student{
    //private variable
    private int rollNo;

    //public variable
    public String name;

    //protected variable
    protected double marks;

    //default/package private variable
    String department;

    //constructor
    Student(int rollNo ,String name, double marks ){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    void display()
    {
        System.out.println("roll no:"+rollNo);
        System.out.println("name:"+name);
        System.out.println("marks :"+marks);
        System.out.println("department:"+department);
    }
}
public class ClassObjectDemo{
       public static void main(String[] args) {
        Student s1 =new Student(101, "Arpita", 85.5);
        s1.department="computer science";
        s1.display();
       }
}