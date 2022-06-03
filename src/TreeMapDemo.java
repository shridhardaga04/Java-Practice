/**
 * TreeMap stores data in sorted manner.
 * It can not contain NULL key, as in TreeMap data is first compare by compareTo() method (Comparable Interface implement)
 * So if NULL key present it will give NPE
 * We can use Comparator Interface => compare() Method to sort data also for that TreeMap add constructor of class where sort/compare logic is written declaration - ... TreeMap<>(new SortedClassName)
 *
 */

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        User u1 = new User("Adi", 85);
        User u2 = new User("Zaid", 70);
        User u3 = new User("Mohan", 61);
        User u4 = new User("Tara", 93);

        Map<User, Double> tm = new TreeMap<>();
        tm.put(u1,u1.getPercentage());
        tm.put(u2,u2.getPercentage());
        tm.put(u3,u3.getPercentage());
        tm.put(u4, u4.getPercentage());


        Map<User, Double> tm2 = new TreeMap<>(new sortByName());
        tm2.put(u1,u1.getPercentage());
        tm2.put(u2,u2.getPercentage());
        tm2.put(u3,u3.getPercentage());
        tm2.put(u4, u4.getPercentage());

        System.out.println("TreeMap Sorted by Percentage : ");
        for(Map.Entry<User, Double> m : tm.entrySet()){
            System.out.println(m.getKey().getName() + " : " + m.getValue());
        }

        System.out.println("TreeMap Sorted by Name : ");
        for(Map.Entry<User, Double> m : tm2.entrySet()){
            System.out.println(m.getKey().getName() + " : " + m.getValue());
        }

        System.out.println(tm2.get(u2));
    }
}

class User implements Comparable<User>{
    private String name;
    private double percentage;

    public User() {
    }

    public User(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.percentage, percentage) == 0 && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, percentage);
    }

    @Override
    public int compareTo(User o) {
        return (int)(this.percentage - o.percentage);
    }
}

class sortByName implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {
        return o1.getName().compareTo(o2.getName());
    }
}