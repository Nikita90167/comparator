import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String[] countWordsPersonFirst = o1.getSurname().split("\\P{Alpha}+");
        String[] countWordsPersonSecond = o2.getSurname().split("\\P{Alpha}+");
        if (countWordsPersonFirst.length > countWordsPersonSecond.length) {
            return 1;
        } else if (countWordsPersonSecond.length > countWordsPersonFirst.length) {
            return -1;
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}
