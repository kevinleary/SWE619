public class Stack {
    private Object[] elements; private int size = 0;

    public Stack() { this.elements = new Object[6]; }

    public void push (Object e) {
        if (e == null) throw new NullPointerException("Stack.push");
//        ensureCapacity();
        elements[size++] = e;
    }

//    private void ensureCapacity() {
//        elements.
//    }

    public void pushAll (Object[] collection) { for (Object obj: collection) { push(obj); } }

    public Object pop () {
        if (size == 0) throw new IllegalStateException("Stack.pop");
        Object result = elements[--size];
        // elements[size] = null;
        return result;
    }

    @Override public String toString() {
        String result = "size = " + size;
        result += "; elements = [";
        for (int i = 0; i < elements.length; i++) {
            if (i < elements.length-1)
                result = result + elements[i] + ", ";
            else
                result = result + elements[i];
        }
        return result + "]";
    }
}