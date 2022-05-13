import java.util.*;

/**
 * 1. final class
 * 2. final variables
 * 3. no setters
 * 4. final methods
 * 5. public constructor
 */
public class ImmutableDemo {

    public static void main(String[] args) {
        ImmutablePerson p1 = new ImmutablePerson("ddd", 22, new ArrayList<>(), new StringBuilder("lastName"));
        List<Address> ad1 = p1.getAd();
        ad1.add(new Address());
    }
}

final class ImmutablePerson{
    private final String name;
    private final StringBuilder lastName;
    private final int age;
    private final List<Address> ad = new ArrayList<>();

    public ImmutablePerson(String name, int age, List<Address> ad, StringBuilder lastName) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        Collections.copy(this.ad, ad);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName.toString();
    } // While dealing with StringBuilder we can return SB by converting to String so that immutability can be achieved

    public List<Address> getAd() {
        return Collections.unmodifiableList(this.ad);
    }
}

class Address{

}