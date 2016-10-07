import java.util.*;
import java.io.Serializable;

public class QueueArray {
  
  private int first;
  private int last;
  private int size;
  private int[] queue;
  
  QueueArray(int capacity) {
    this.queue = new int[capacity];
    this.first = 0;
    this.last = 0;
    this.size = 0;
  }
  
  public void enqueue(int data) {
    if(queue.length == size){
      return;
    }else{
      size++;
      queue[last] = data;
      last++;
    }
   }
  
  public int dequeue() {
    int data = 0;
    
    if(isEmpty()) {
      return data;
    }else{
    size--;
    data = queue[first];
    first++;
    }
    return data;
  }
  
  public boolean isEmpty() {
    return size == 0;
  }
  }