
public class ArrayQueue {
	private int capacity;
	private int head = 0;
	private int tail = 0;
	private String[] storage;
	
	public ArrayQueue(int size) {
	    capacity = size;
	    storage = new String[capacity];
	}
	
	public void show() {
	    
	    for (int j = capacity-1; j >= 0; j--) { 
	      for (int i = capacity-1; i >= 0; i--) {
	    	  System.out.println("queue[" + j-- + "] = " + storage[i]);
	        /* print like this: 
	        stack[nth] = nth value
	        stack[n3] = 4th value
	        stack[n4] = 3rd value
	        stack[n1] = 2nd value
	        stack[n0] = 1st value
	        */
	      } 
	      }
	    System.out.println();
	  }
	 private boolean isEmpty() {
		    if (storage[0] == null) {
		      // print error message
		      System.out.println("STORAGE IS EMPTY.");
		      System.out.println();
		      return true;
		    } 
		    return false;
		  }

		  private boolean isFull() {
		    if (head == capacity) {
		      System.out.print("Storage is full.");
		      System.out.println();
		      return true;
		    } 
		    return false;
		  }
	public void enqueue(String value) {
	    if (isFull()) {
	      // print error message
	      System.out.println("Enqueue Failed.");
	    } else {
	      System.out.println("... trying to enqueue[" + head + "] ...");
	      storage[head] = value;
	      head++;
	   
	      System.out.println(value + " was successfully added.");
	      System.out.println();
	    }
	  }
	public void dequeue() {
	    if (isEmpty()) {
	      // print error message
	    System.out.print("Dequeue Failed.");
	      System.out.println();
	    } else {
	      System.out.println("... trying to dequeue[" + (head-1) + "] ...");
	      storage[head] = null;
	      head--;

	      System.out.println(storage[head] + " was successfully removed.");
	      System.out.println();
	    }
	  }
	public void peek() {
	    if (storage[head] == storage[0]) {
	      System.out.println("PEEK Head = " + storage[head]);
	      System.out.println();
	    } else {
	      System.out.println("PEEK Head = " + storage[head-1]);
	      System.out.println();
	    }
	  }
	  
	  public static void main(String[] args) {
		  ArrayQueue storage = new ArrayQueue(10);
	  
	    System.out.println("STORAGE CAPACITY = " + storage.capacity);
	    System.out.println();
	    storage.show();
	    storage.dequeue();
	    storage.peek();
	    storage.enqueue("one");
	    storage.show();
	    storage.peek();
	    storage.enqueue("two");
	    storage.show();
	    storage.peek();
	    storage.enqueue("three");
	    storage.show();
	    storage.peek();
	    storage.enqueue("four");
	    storage.show();
	    storage.enqueue("five"); 
	    storage.show();
	    storage.dequeue();
	    storage.enqueue("six"); 
	    storage.enqueue("seven"); 
	    storage.enqueue("eight"); 
	    storage.enqueue("nine");    
	    storage.enqueue("ten"); 
	    storage.show();
	    storage.peek();
	    storage.enqueue("eleven");
	    storage.enqueue("twelve");
	    storage.show();
	  }  

	
}
