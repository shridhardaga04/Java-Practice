public class MethodOverloadingDemo {
//    public void print(int n){
//        System.out.println("Printing int = " + n);
//    }
    public void print(){
        System.out.println("Print with no arg");
    }
    public void print(String s){
        System.out.println("Printing String = " + s);
    }
    public void print(Object o){
        System.out.println("Printing Object = " + o);
    }
    public void print(Integer i){
        System.out.println("Printing Integer = "+ i);
    }
//    public void print(long l){
//        System.out.println("Printing long = " + l);
//    }
    public void print(double d){
        System.out.println("Printing double = "+ d);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo m1 = new MethodOverloadingDemo();
        m1.print(8); // int
        m1.print(8.5); //Object
        m1.print(7);
        m1.print("Suupp");
    }
//     int >> long >> double >> Integer >> Long
}
