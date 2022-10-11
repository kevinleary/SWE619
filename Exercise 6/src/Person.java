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



    public static void main(String args[]) {
        List<Person> lP = new ArrayList<Person>();
        Person p1 = new Person();
        p1.gender = Sex.MALE;
        p1.birthday = LocalDate.of(1997, 4, 10);
        p1.name = "test";
        p1.emailAddress = "testtest@test.com";
        lP.add(p1);

        printPersonsOlderThan(lP, 24);
    }
}