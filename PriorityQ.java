public class PriorityQ extends Heap {
  
  // -------------------------------------------------------------
  public PriorityQ(int s) // constructor
  {
    super(s);
  }

  // -------------------------------------------------------------
  public void insert(long item) // insert item
  {
    insert(Math.round(item));
  } // end insert()

  // -------------------------------------------------------------
  public Node remove() // remove maximum item
  {
    return super.remove();
  }
  // -------------------------------------------------------------

  public long peekMax() // peek at maximum item
  {
    int maxItem = remove().getKey();
    insert(maxItem);
    return maxItem;
  }

  // -------------------------------------------------------------
  public boolean isEmpty() // true if queue is empty
  {
	return currentSize == 0;
  }

  // -------------------------------------------------------------
  public boolean isFull() // true if queue is full
  {
    return (currentSize == maxSize);
  }
  // -------------------------------------------------------------
} // end class PriorityQ