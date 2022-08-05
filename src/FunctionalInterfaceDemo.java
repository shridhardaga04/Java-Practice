import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Student s1 = new Student(23, "Shridhar", "Solapur");
        Student s2 = new Student(25, "Deepak", "Ralegoan");
        Student s3 = new Student(21, "Yash", "Nanded");
        Student s4 = new Student(26, "Sanket", "Murshi");
        Student s5 = new Student(24, "Varad", "Aurangabad");
        Student s6 = new Student(20, "Tanmesh", "Neera");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        // Make list of age of student using stream
        List<Integer> studentAge = studentList.stream()
                .map(Student::getAge)
                .collect(Collectors.toList());

        System.out.println("Average Age of students :" +
                (studentAge.stream()
                        .reduce(Integer::sum))
                        .orElse(0) / studentAge.size());

        System.out.println("Sum of Age of students :" +
                studentAge.stream()
                        .reduce(0, (a, b) -> a + b));

        System.out.println("Name of all Students :" +
                studentList.stream()
                        .map(Student::getName)
                        .collect(Collectors.toSet()));

        System.out.println("Oldest Student: " +
                (studentAge.stream()
                        .max(Integer::compareTo)).orElse(-1));

        System.out.println("Youngest Student: " +
                (studentAge.stream()
                        .min(Integer::compareTo))
                        .orElse((-1)));

        System.out.println("Student who lives is Nanded : " +
                studentList.stream()
                        .filter(s -> s.getCity().equals("Nanded"))
                        .map(Student::getName).findFirst());

        Consumer<Integer> consumer = System.out::println;
        Predicate<String> predicate = s -> s.contains("a");
        Supplier<Student> supplier = () -> s1;

        // Use of Consumer
        System.out.println("Age of students :");
        for (Integer a : studentAge) {
            consumer.accept(a); // print age
        }

        // Use of Predicate
        System.out.print("Does "+ s3.getCity()+" City contains 'a' : ");
        System.out.println(predicate.test(s3.getCity())); // Will display if s3 city have "a"

        // Use of Supplier
        System.out.print("Student s1: ");
        System.out.println(supplier.get()); // getting s1 value/obj
    }
}

class Student {
    private int age;
    private String name;
    private String city;

    public Student(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student -> {" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}