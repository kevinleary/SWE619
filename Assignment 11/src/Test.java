import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {

    public static void main(String arg[]){

        List<String> ls1 = new ArrayList<>();
        ls1.add("cat");
        ls1.add("dog");

        List<String> ls2 = new InstrumentedList<>(ls1);
//        ls2.add("cat");
//        ls2.add("dog");

        System.out.println(ls1.toString());
        System.out.println(ls2.toString());

        System.out.println(ls1.equals(ls2));
        System.out.println(ls2.equals(ls1));


        /*
            1. There is no problem with equals due to dynamic dispatching (?). Stepping through the code
                it appears that the super equals is used which allows no problems. All the way up to
                object. Hence the Dynamic Dispatching.
         */

        Collection<String> co1 = new ArrayList<>();
        co1.add("cat");
        co1.add("dog");

        Collection<String> co2 = new InstrumentedCollection<>(co1);
//        co2.add("cat");
//        co2.add("dog");

        System.out.println(co1.toString());
        System.out.println(co2.toString());

        System.out.println(co1.equals(co2));
        System.out.println(co2.equals(co1));

        /*
            2. Collection doesn't contain an equals() method that can go up the super calls to satisfy equals.
                It can only utilize the equals() provided with ArrayList() in the first dispatching.
         */

    }
}
