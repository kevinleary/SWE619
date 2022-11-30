import java.util.*;
import java.time.*;
import java.lang.String;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return 25;

    }

    public Sex getGender() {
        return this.gender;

    }

    // Approach 3
    interface CheckPerson {
        boolean test(Person p);
    }

    // Approach 3
    static class CheckPersonEligibleForSelectiveService implements CheckPerson {
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }

    public void printPerson() {
        // ...
        String g;
        if (this.gender == Sex.MALE) { g = "MALE"; }
        else { g = "FEMALE"; }
        System.out.println(g + " " + this.birthday + " " + this.name + " " + this.emailAddress);
    }

    // Approach 1
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    // Approach 2
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    // Approach 3
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }


    public static void main(String[] args) {
        List<Person> lP = new ArrayList<Person>();
        Person p1 = new Person();
        p1.gender = Sex.MALE;
        p1.birthday = LocalDate.of(1997, 4, 10);
        p1.name = "test";
        p1.emailAddress = "testtest@test.com";
        lP.add(p1);

        printPersonsOlderThan(lP, 24);
        printPersonsWithinAgeRange(lP, 24, 26);
        printPersons(lP, new CheckPersonEligibleForSelectiveService());
        // Approach 4
        printPersons(lP, new CheckPerson() {
                    public boolean test(Person p) {
                        return p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 18
                                && p.getAge() <= 25;
                    }
                }
        );

        // Approach 5
        printPersons(
                lP,
                (Person p) -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25
        );
    }
}