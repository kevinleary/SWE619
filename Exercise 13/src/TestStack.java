public class TestStack {

    public static void main(String args[]) {

        Stack s = new Stack();
        Object o1 = new String();
        Object o2 = new String();
        Object o3 = new String();
        o1 = "test";
        o2 = "new";
        o3 = "okay";
        s.push(o1);
        s.push(o2);
        s.push(o3);

        System.out.println(s.toString());

        s.pop();
        System.out.println(s.toString());

        Object[] o4 = {"one", "two", "three"};
        s.pushAll(o4);
        System.out.println(s.toString());
    }
}
