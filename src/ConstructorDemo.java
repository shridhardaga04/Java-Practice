import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * In Constuctor exception can’t handle it using try-catch mechanism as super() will be first line executed implicitly. That’s why we need to throw the exception.
 * While doing this we need to throw exception from child classes also. For child class we can throw same exception or parent of tht exception.
 */
public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("Default Constructor");
    }
    public static void main(String[] args) throws Exception {
        C c = new C();
    }
}

class A{
    public A() throws FileNotFoundException {
        System.out.println("In A");
    }
}

class B extends  A{
    public B() throws IOException {
        System.out.println("In B");
    }
}

class C extends  B{
    public C() throws Exception{
        System.out.println("In C");
    }
}