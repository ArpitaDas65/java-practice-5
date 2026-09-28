import mypackage.Calculator;

public class packageDemo{
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println("Addition:"+c.add(10,20));

        System.out.println("multiplication:"+c.multiply(10,20));
    }
}
