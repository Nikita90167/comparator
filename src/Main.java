import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PersonComparator comparator = new PersonComparator();
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Nikita", "The Greatest Man", 17);
        Person person2 = new Person("Oleg", "Olegovich", 25);
        Person person3 = new Person("Jastin", "BI BI BI BER", 10);
        Person person4 = new Person("Dima", "Dimkovich", 100);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.sort(comparator);
        System.out.println(people);
        Predicate<Person> comparison;
        comparison = (person) -> person.getAge() < 18;
        people.removeIf(comparison);
        System.out.println(people);

    }
}