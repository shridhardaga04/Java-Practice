public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("Default Constructor");
    }
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A(){
        System.out.println("In A");
    }
}

class B extends  A{
    public B(){
        System.out.println("In B");
    }
}

class C extends  B{
    public C(){
        System.out.println("In C");
    }
}