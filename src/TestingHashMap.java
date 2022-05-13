import java.util.*;

class Person {

//    TreeSet
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    List<Person> persons = new ArrayList();
    List<Person> getAllPerson() {
        return Collections.unmodifiableList(persons);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class TestingHashMap {
    public static void main(String[] args) {
        Map<Person, Integer> m = new HashMap<>();
        Person p1 = new Person("Amit", 11, "Male");
        Person p3 = new Person("Akjmit", 50, "Male");
        Person p4 = new Person("Amiklnt", 1, "Male");
        Person p2 = new Person("Amnt", 5, "Male");

        m.put(p1, p1.getAge());
        m.put(p2, p2.getAge());

        System.out.println("display person");
        System.out.println(m);

        System.out.println("getting p1");
        System.out.println(m.get(p1));

        System.out.println("getting new p1");
        System.out.println(m.get(new Person("Amit", 11, "Male")));

    }
}
