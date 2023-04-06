import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Comparator<Person> comparatorLambda;
        comparatorLambda = (o1, o2) -> {
            String[] countWordsPersonFirst = o1.getSurname().split("\\P{Alpha}+");
            String[] countWordsPersonSecond = o2.getSurname().split("\\P{Alpha}+");
            if (countWordsPersonFirst.length > countWordsPersonSecond.length) {
                return 1;
            } else if (countWordsPersonSecond.length > countWordsPersonFirst.length) {
                return -1;
            } else {
                return o1.getAge() - o2.getAge();
            }
        };

        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Nikita", "The Greatest Man", 17);
        Person person2 = new Person("Oleg", "Olegovich", 25);
        Person person3 = new Person("Jastin", "BI BI BI BER", 10);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.sort(comparatorLambda);
        System.out.println(people);
    }
}