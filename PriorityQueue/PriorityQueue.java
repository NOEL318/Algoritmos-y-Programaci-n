public class PriorityQueue {
  private int priorities;
  private Queue[] subQueues;

// This part of the code is the constructor for the `PriorityQueue` class. It initializes a
// `PriorityQueue` object with a specified number of subqueues and priorities.
  public PriorityQueue(int N, int priorities) {
    this.priorities = priorities;
    this.subQueues = new Queue[priorities];
    for (int i = 0; i < priorities; i++) {
      subQueues[i] = new Queue(N);
    }
  }

/**
 * The `insert` function inserts a `PriorityObject` into a specific subqueue based on its priority.
 * 
 * @param object The `insert` method takes a `PriorityObject` as a parameter. The `PriorityObject`
 * class likely has two properties: `priority` and `object`. In this method, the priority of the
 * `PriorityObject` is used to determine the index in the `subQueues` array where
 */
  public void insert(PriorityObject object) throws Exception {
    int i = object.getPriority() - 1;
    subQueues[i].cqinsert(object.getObject());
  }

/**
 * The `delete` function iterates through subqueues and deletes an object from the first non-empty
 * subqueue, throwing an exception if all subqueues are empty.
 * 
 * @return The `delete()` method is returning an object that is deleted from one of the subQueues.
 */
  Object delete() throws Exception {
    for (int i = 0; i < priorities; i++) {
      if (subQueues[i].getCount() == 0)
        continue;
      return subQueues[i].cqdelete();
    }
    throw new ArrayIndexOutOfBoundsException();
  }

  public static void main(String[] args) throws Exception {
    PriorityQueue Queue = new PriorityQueue(6, 3);

    Queue.insert(new PriorityObject("Hola", 1));
    Queue.insert(new PriorityObject("Como", 1));
    Queue.insert(new PriorityObject("Estás", 3));
    Queue.insert(new PriorityObject("Querido", 2));
    Queue.insert(new PriorityObject("Amigo", 2));

// The code snippet `System.out.println(Queue.delete());` is calling the `delete()` method on the
// `Queue` object multiple times and printing the returned object.
    System.out.println(Queue.delete());
    System.out.println(Queue.delete());
    System.out.println(Queue.delete());
    System.out.println(Queue.delete());
    System.out.println(Queue.delete());
  }
}
