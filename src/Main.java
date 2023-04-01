import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonComparator comparator = new PersonComparator();
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Nikita", "The Greatest Man", 17);
        Person person2 = new Person("Oleg", "Olegovich", 25);
        Person person3 = new Person("Jastin", "BI BI BI BER", 10);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}