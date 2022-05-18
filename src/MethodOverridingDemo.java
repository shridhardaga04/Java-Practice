import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Method Overriding = Run time polymorphism
 * Access Modifier = Overridden Method cannot be less access means Protected => can not be overridden as Private
 * Final, Private, Constructor (duh..!) method cannot be overridden - Compile time error
 * Static methods can not be overridden: When you define a static method with same signature as a static method in base class, it is known as "method hiding".
 *Overriding and Exception-Handling : Below are two rules to note when overriding methods related to exception-handling.
 * Rule#1 : If the super-class overridden method does not throw an exception, subclass overriding method can only throws the unchecked exception, throwing checked exception will lead to compile-time error.
 * Rule#2 : If the super-class overridden method does throws an exception, subclass overriding method can only throw same, subclass exception. Throwing parent exception in Exception hierarchy will lead to compile time error.Also there is no issue if subclass overridden method is not throwing any exception.
 */

public class MethodOverridingDemo {
    public static void main(String[] args) throws IOException {
        Parent p = new Child();
        p.display();
        p.staticMethod();
    }
}

class Parent {
    public Parent() {
    }
    public void display() throws IOException {
        System.out.println("Parent display()");
    }
    static void staticMethod(){
        System.out.println("Parent static method");
    }

}

class Child extends Parent{

    public Child(){

    }
    public void display() { // Here we can throws FileNotFoundException or IOException or will not throw anything, but we cannot throws Exception
        System.out.println("Child display()");
    }
    static void staticMethod(){
        System.out.println("Child static method");
    }

}