public class Main {
  
  public static void main(String[] args){
    
    QueueArray q = new QueueArray(8);
    
    q.enqueue(6);
    q.enqueue(4);
    q.enqueue(3);
    q.enqueue(9);
    q.enqueue(5);
    q.enqueue(8);
    q.enqueue(2);
    q.enqueue(1);
    
    while(!q.isEmpty()) {
    System.out.print(q.dequeue() + " ");
    }
    
  }
}