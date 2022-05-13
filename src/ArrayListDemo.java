import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

//        List<int> list = new ArrayList<>(); // Will give compile error as type arg cannot be of primitive type it should be Wrapper calss

//        for (int i = 0; i < 5; i++){
//            names.add(sc.next());
//        }
        names.add(5);
        names.add(6);
        names.add(4);
        names.add(3);

        System.out.println("Displaying ArrayList by Foreach");

        for(int n : names){
            System.out.print(n);
        }
        System.out.println();
        System.out.println("Displaying ArrayList by For");

        for(int k = 0; k < names.size(); k++){
            System.out.print(names.get(k));
        }
        System.out.println();

//        System.out.println(names.contains("5"));
//        System.out.println(names.indexOf("India"));
        Collections.sort(names);
        System.out.println("Sorted List = "+names);

        // Add squares of numbers from name List
        List<Integer> squareList = new ArrayList<>();
        names.stream().forEach(num -> squareList.add(num * num));
        System.out.println("Square List = "+squareList);

        // Add numbers from squareList which are divisible by 3
        List <Integer> divisibleByThree = new ArrayList<> ();
        squareList.stream()
                .filter(num -> num % 3 == 0)
                .forEach(num -> divisibleByThree.add(num));
        System.out.println("Divisible by 3 List = "+divisibleByThree);
    }
}
