public class DoubleHeadCircleList {

    private char info;                  // Almacena el valor del nodo
    private DoubleHeadCircleList next;  // Apunta al siguiente nodo en la lista circular
    private DoubleHeadCircleList prev;  // Apunta al nodo anterior en la lista circular

    public DoubleHeadCircleList() {
        this.next = this;               // La lista se inicializa vacía apuntando a sí misma
        this.prev = this;               // El nodo anterior también apunta a sí mismo
    }

    public char getInfo() {
        return info;
    }

    public DoubleHeadCircleList getNext() {
        return next;
    }

    public DoubleHeadCircleList getPrev() {
        return prev;
    }

    // Inserta un nuevo nodo después del nodo actual
    public void insert(char v) {
        DoubleHeadCircleList node = new DoubleHeadCircleList();
        node.info = v;

        node.next = this.next;
        node.prev = this;
        this.next.prev = node;
        this.next = node;
    }

    // Busca el primer nodo que contiene el valor v
    public DoubleHeadCircleList find(char v) {
        DoubleHeadCircleList node = this.next;

        while (node != this) {
            if (node.info == v) {
                return node;
            }
            node = node.next;
        }
        
        return null;
    }

    // Obtiene el nodo en la posición p (donde 0 es la cabeza)
    public DoubleHeadCircleList get(int p) {
        DoubleHeadCircleList node = this.next;

        for (int i = 0; i < p; i++) {
            if (node == this) {
                return null;   // Indica que la posición está fuera de los límites
            }
            node = node.next;
        }
        
        return node;
    }

    // Elimina un nodo específico de la lista
    public void delete(DoubleHeadCircleList e) throws Exception {
        if (e == this) {
            throw new Exception("No se puede eliminar el nodo de la cabeza");
        }

        e.prev.next = e.next;
        e.next.prev = e.prev;
    }

    // Muestra el contenido de la lista desde el primer nodo después de la cabeza
    public void display(String message) {
        System.out.println();
        System.out.println(message);

        DoubleHeadCircleList node = this.next;
        int i = 0;

        while (node != this) {
            System.out.println(i + ": " + node.info);
            node = node.next;
            i++;
        }
    }

    // Inserta un nodo con valor V al final de la lista
    public void INSEND(char v) {
        DoubleHeadCircleList node = new DoubleHeadCircleList();
        node.info = v;

        node.prev = this.prev;
        node.next = this;
        this.prev.next = node;
        this.prev = node;
    }

    // Inserta un nodo con valor V de manera ordenada
    public void INSORT(char v) {
        DoubleHeadCircleList node = new DoubleHeadCircleList();
        node.info = v;

        DoubleHeadCircleList current = this.next;
        
        while (current != this && current.info < v) {
            current = current.next;
        }

        node.next = current;
        node.prev = current.prev;
        current.prev.next = node;
        current.prev = node;
    }

    // Encuentra y elimina el primer nodo que contiene el valor V
    public void DELETE(char v) throws Exception {
        DoubleHeadCircleList current = this.next;

        while (current != this && current.info != v) {
            current = current.next;
        }

        if (current == this) {
            throw new Exception("Valor no encontrado en la lista");
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
    }
}
