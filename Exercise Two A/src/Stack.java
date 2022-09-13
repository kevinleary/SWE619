public class Stack implements Cloneable {

   private Object[] elements;
   private int size = 0;
   private static final int DEFAULT_INITIAL_CAPACITY = 16;


   public Stack() {
     this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
   }
   
   public Stack(Object[] stuff) {
	   elements = stuff;
	   size = elements.length;
   }
   
   public Stack push (Object e) {
//     ensureCapacity(); - wrong for immutable version
	   
     elements[size++] = e;
     
     Object[] newElements = new Object [this.size+1];
     Stack result = new Stack(newElements);
     return result;

   }

   public Stack pop () {
	   // mutator 
     if (size == 0) throw new IllegalStateException("Stack.pop");
     Object result = elements[--size];
     elements[size] = null;    // Eliminate obsolete reference
     return (Stack) result;
   }
   
   public Object top() {
	   //observer 
	   
	   //need to write this
	   if (size == 0) throw new IllegalStateException("Stack.pop");
//	   int peek = size - 1;
	   Object result = elements[--size];
	   
	   return result;
	   
   }

   private void ensureCapacity() {
      if (elements.length == size) {
         Object oldElements[] = elements;
         elements = new Object[2*size + 1];
         System.arraycopy(oldElements, 0, elements, 0, size);
      }
   }

}