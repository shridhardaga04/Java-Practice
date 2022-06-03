/**
 * Interface can have method body for default and static functions. Cannot have private or protected methods
 * We can override default functions in concrete class, but cannot override static functions.
 * As variables declared in interface are Public final and static.
 */

interface TestInterface {
    int display();
    int COST = 25; /** cannot be private and protected **/
    default int defaultDisplay(){
        System.out.println("In Default Display");
        return 5;
    }
    static void staticDisplay(){
        System.out.println("In static Display");
    }
}

class Concrete implements TestInterface {

    @Override
    public int display() {
        return TestInterface.COST;
    }

    @Override
    public int defaultDisplay() {
        return 80;
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        TestInterface t = new Concrete();
        System.out.println(t.display());
        System.out.println(t.defaultDisplay());
        TestInterface.staticDisplay();
    }
}
