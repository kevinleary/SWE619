import java.util.*;


public class Example {
    int val;

    public Example(int val){
        this.val = val;
    }

}


class ExampleComparator <T extends Comparable<T>> implements Comparator<T> {

    @Override
    public int compare(T t1, T t2) {
        return t2.compareTo(t1);
    }

}

class Tester {

    public static void main(String[] args) {

        Set<String> tS = new TreeSet<>(
                (t1, t2) -> t2.compareTo(t1)
        );

        Set<String> hS = new HashSet<>(
                (t1, t2) -> t2.compareTo(t1)
        );
    }
}
