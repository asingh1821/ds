package inheritance;

public class Test {
    ///single inheritance example
//import java.util.*;


        public static void main(String[] args)
        {
            A ob2 =new A();
            ob2.showA();
            B ob1=new B();
            ob1.showB();
          C ob3=new C();
          ob3.run();

        }

}
class C
{
    public void run()
    {
        System.out.println("running");
    }
}
class A {
    void showA() {
        System.out.println("a class method");
    }
}
class B extends A {
    void showB() {
        System.out.println("b class method");
    }


}