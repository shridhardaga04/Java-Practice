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
        ImmutablePerson p1 = new ImmutablePerson("ddd", 22, new ArrayList<>());
        List<Address> ad1 = p1.getAd();
        ad1.add(new Address());
    }
}

final class ImmutablePerson{
    private final String name;
    private final int age;
    private final List<Address> ad = new ArrayList<>();

    public ImmutablePerson(String name, int age, List<Address> ad) {
        this.name = name;
        this.age = age;
        Collections.copy(this.ad, ad);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Address> getAd() {
        return Collections.unmodifiableList(this.ad);
    }
}

class Address{

}