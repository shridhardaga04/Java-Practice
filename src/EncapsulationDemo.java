/**
 * Encapsulation in Java is a process of wrapping code and data together into a single unit
 * We can create a fully encapsulated class in Java by making all the data members of the class private.
 * Now we can use setter and getter methods to set and get the data in it.
 * It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
 * It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.
 */
public class EncapsulationDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty() || name.trim().length() == 0) {
            System.out.println("Name cannot be blank or NULL");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 110) // Validating age
            this.age = age;
        else
            System.out.println("Age can not be negative or greater than 110");
    }
    @Override
    public String toString() {
        return "EncapsulationDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        EncapsulationDemo e = new EncapsulationDemo(); // Default Constructor with no para and empty body will be written by java
        e.setName("Shridhar");
        e.setAge(23);
        System.out.println("Age of "+ e.getName() + " is " + e.getAge());

        e.setName("  ");
        e.setAge(-5);
    }
}
