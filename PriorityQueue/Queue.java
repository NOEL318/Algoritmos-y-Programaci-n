public class Queue {
  private Object[] array;
  private int front, rear, count;
  private int size;

  public Queue(int n) {
    array = new Object[n];
    front = rear = -1;
    size = n;
    count = 0;
  }

  public int getCount() { return this.count; }

  public void cqinsert(Object element) throws Exception {
    if (count == size) {
      throw new Exception("Cola llena");
    }

    if (rear == size - 1) {
      rear = 0;
    } else {
      rear++;
    }

    array[rear] = element;
    count++;

    if (front == -1) {
      front = 0;
    }
  }

  public Object cqdelete() throws Exception {
    if (count == 0) {
      throw new Exception("Cola vacía");
    }

    Object element = array[front];

    if (front == size - 1) {
      front = 0;
    } else {
      front++;
    }

    count--;

    if (count == 0) {
      front = rear = -1;
    }

    return element;
  }

  public void printQueue() {
    if (count == 0) {
      System.out.println("La cola está vacía");
      return;
    }

    System.out.print("Elementos en la cola: ");
    int current = front;
    for (int i = 0; i < count; i++) {
      System.out.print(array[current] + " ");
      current = (current + 1) % size;
    }
    System.out.println();
  }

  // Test the Queue class
  public static void main(String[] args) {
    Queue queue = new Queue(5);

    try {
      // Insertar los strings "One", "Two", "Three", "Four", y "Five"
      queue.cqinsert("One");
      queue.cqinsert("Two");
      queue.cqinsert("Three");
      queue.cqinsert("Four");
      queue.cqinsert("Five");

      // Imprimir el estado de la cola después de las inserciones
      queue.printQueue(); // Debería imprimir: "Elementos en la cola: One Two
      // Three Four Five"

      // Eliminar los primeros dos elementos de la cola y mostrarlos
      System.out.println(queue.cqdelete()); // Imprime "One"
      System.out.println(queue.cqdelete()); // Imprime "Two"

      // Insertar los strings "Six", "Seven", y "Eight"
      try {
        queue.cqinsert("Six");
        queue.cqinsert("Seven");
        queue.cqinsert("Eight"); // Esta inserción debería lanzar una excepción
      } catch (Exception e) {
        System.out.println("Exception occurred: " + e.getMessage());
      }

      // Imprimir el estado de la cola después de insertar "Six" y "Seven"
      queue.printQueue(); // Debería imprimir: "Elementos en la cola: Three Four
      // Five Six Seven"

      // Eliminar todos los elementos de la cola hasta que se lance una
      // excepción
      try {
        while (true) {
          System.out.println(queue.cqdelete());
        }
      } catch (Exception e) {
        System.out.println("Exception occurred: " + e.getMessage());
      }

    } catch (Exception e) {
      System.out.println("Exception occurred: " + e.getMessage());
    }
  }
}
