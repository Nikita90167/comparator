public class Person {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return " { " + "Имя: " + name + " фамилия: " + surname + " возраст: " + age + " } ";
    }
}
