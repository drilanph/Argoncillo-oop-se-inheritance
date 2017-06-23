package ConstructorBehavior;
public class ADemo {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A("wew");
        A a2 = new A(1);
        A a3 = new A("String",12);
        
        a1.setX("wew");
        a2.setY(1);
        System.out.println(a1.getX());
        System.out.println(a2.getY());
    }
}
