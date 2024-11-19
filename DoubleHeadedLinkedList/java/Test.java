public class Test {
  public static void main(String[] args) throws Exception {
      DoubleHeadCircleList list = new DoubleHeadCircleList();
      
      // Ejemplos para insert
      list.INSORT('A');
        list.INSORT('B');
        list.INSORT('D');
        list.INSORT('E');
        list.display("Insertando A, B, D y E en orden con INSORT");

        // Insertar C y F en orden
        list.INSORT('C');
        list.display("Insertando C con INSORT en la lista ordenada");

        list.INSORT('F');
        list.display("Insertando F con INSORT en la lista ordenada");

      // Ejemplos para INSEND
      list.INSEND('Z');
      list.display("Insertando Z al final con INSEND");

      list.INSEND('Y');
      list.display("Insertando Y al final con INSEND");

      // Ejemplos para DELETE
      list.DELETE('E');
      list.display("Borrando E con DELETE");

      list.DELETE('A');
      list.display("Borrando A con DELETE");
  }
}
