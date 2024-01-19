import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Bienvenido a su Sistema de Ventas \n");
            System.out.println("Productos Disponibles: \n");

            String[][] productos = {
                    { "1", "Coca-Cola Sin Azucar en Vidrio 625ml", "19.90" },
                    { "2", "Gansito", "14.00" },
                    { "3", "Chocolate De Leche con Almendra Hershey's 250gr", "14.00" } };
            String[][] carrito = {};

            for (int i = 0; i < productos.length; i++) {
                System.out.println(productos[i][0] + " - $" + productos[i][2] + " - " + productos[i][1]);
            }
            int opt = sc.nextInt() - 1;

            System.out.println("Usted Selecciono el producto: ");
            System.out.println(productos[opt][0] + " - $" + productos[opt][2] + " - " + productos[opt][1]);
            System.out.println("Desea agregarlo al carrito de compras? 1==SI 2==NO");
            
            String[] seleccionado={productos[opt][0], productos[opt][2] , productos[opt][1]};
            int dec = sc.nextInt();
            if (dec == 1) {
                System.out.println("Se agrego a su carrito de compras");
                seleccionado.
            } else if (dec == 2) {
                System.out.println("No se agrego a su carrito de compras");
            }

        }
    }
}
