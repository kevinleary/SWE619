/**
 * Bloch's Generic Stack example
 * SWE 619
 */


//MAKE THIS IMMUTABLE 

//Immutables dont have mutators 

import java.util.*;

public class Stack <E> {

  private E[] elements;
  private int size = 0;
  private static final int DEFAULT_CAPACITY = 16;


  	//Creator
  @SuppressWarnings("unchecked") // All items in elements[] are of type E
  public Stack() {   
     // this.elements = new E[DEFAULT_CAPACITY];  // doesn't compile
     this.elements = (E[]) new Object[DEFAULT_CAPACITY];
  }
  
  //Producer - not Creator because of arg
  public Stack(E[] stuff) {
	   elements = stuff;
	   size = elements.length-1;
  }
  
  //Producer
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public Stack push (E e) {
	   elements[size++] = e;
	   Object[] newElements = new Object [this.size+1];
	   System.arraycopy(this.elements, 0, newElements, 0, this.size);
	   Stack result = new Stack(newElements);
	   result.elements[size-1] = e; 
	   return result;
  }

  //Producer
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public Stack pop () {
    if (size == 0) throw new IllegalStateException("Stack.pop");
    elements[--size] = null;
    Object[] newElements = new Object [this.size];
    System.arraycopy(this.elements, 0, newElements, 0, this.size);
    Stack result = new Stack(newElements);
    result.size=size-1;
    return result;
  }

  
  //Observer
  public E top() {
   if (this.isEmpty()) {
       	throw new NoSuchElementException("Queue underflow");
       }
      	return elements[size-1];
  }
  
  public boolean isEmpty() {
     return size == 0;
  }

  // public void pushAll(Iterable<E> src) {   // doesn't compile
  public void pushAll(Iterable<? extends E> src) {
     for (E e: src) {
        push(e);
     }
  }

//   public void popAll(Collection<E> dst) {  // doesn't compile
  public void popAll(Collection<? super E> dst) { 
     while (!isEmpty()) {
        dst.add(top());
        dst.remove(pop());
     }
  }

  @SuppressWarnings("unchecked") // All items in elements[] are of type E
  private void ensureCapacity() {
     if (elements.length == size) {
        Object oldElements[] = elements;
        // elements = new E[2*size + 1];   // doesn't compile
        elements = (E[]) new Object[2*size + 1];
        System.arraycopy(oldElements, 0, elements, 0, size);
     }
  }


 public static void main(String[] args) {
    // Simple exercise to push/pop cmd line args
    Stack <String> s = new Stack <String>();
    for (String arg : args)
       s.push(arg);
    while (!s.isEmpty() )
       System.out.println(s.top().toUpperCase());

    // Exercise for pushAll, popAll
    Stack <Number> s1 = new Stack<Number>();
    Integer i = 1;   
    s1.push(i);
    i = 2; 
    s1.push(i);
    
    s1.pop();

    Collection<Integer> integers = new HashSet<Integer> ();
    integers.add(2);
    integers.add(3);
    s1.pushAll(integers);

    Collection<Object> result = new ArrayList<Object> ();
    s1.popAll(result);


    for (Object n : result) 
       System.out.println(n);
 }
}