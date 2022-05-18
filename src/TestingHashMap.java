import java.util.*;

/**
 * HashMap is NOT a thread safe.
 * Can have one NULL key, but can have multiple NULL values.
 * hashCode() decide the index of values where it will store.
 * If 2 objects are EQUAL then their hashCode() are equal.
 * But if hashCode() are same then it is not necessary objects are equal.
 * HashMap have initial capacity of 16 and load factor of 0.75 (75%)
 */
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

    List<Person> persons = new ArrayList<>();
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

        //i = (n - 1) & hash
        int h1;
        int p1hash = 15 & ((h1 = p1.hashCode()) ^ (h1 >>> 16));
        int h2;
        int p2hash = 15 & ((h2 = p2.hashCode()) ^ (h2 >>> 16));
        int h3;
        int p3hash = 15 & ((h3 = p3.hashCode()) ^ (h3 >>> 16));
        int h4;
        int p4hash = 15 & ((h4 = p4.hashCode()) ^ (h4 >>> 16));

        System.out.println("p1 index : " + p1hash);
        System.out.println("p2 index : " + p2hash);
        System.out.println("p3 index : " + p3hash);
        System.out.println("p4 index : " + p4hash);

        m.put(p1, p1.getAge());
        m.put(p2, p2.getAge());
        m.put(p3, p3.getAge());
        m.put(p4, p4.getAge());
//        m.put(null,85);
//        System.out.print("Printing value for null key: ");
//        System.out.println(m.get(null));
//
//        System.out.println("display person");
//        System.out.println(m);
//
//        System.out.println("getting p1");
//        System.out.println(m.get(p1));
//
//        System.out.println("getting new p1");
//        System.out.println(m.get(new Person("Amit", 11, "Male")));

        System.out.println("Iterating HashMap:");
        for(Map.Entry<Person, Integer> e : m.entrySet()){
            System.out.println("Key = " + e.getKey() + " Value = "+ e.getValue());
        }

    }
}
