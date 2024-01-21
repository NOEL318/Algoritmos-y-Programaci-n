import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] productos = {
                { "1", "Coca-Cola Sin Azucar en Vidrio 625ml", "19.90" },
                { "2", "Gansito", "14.00" },
                { "3", "Chocolate De Leche con Almendra Hershey's 250gr", "14.00" } };

        String[][] carrito = {};
        while (true) {
            System.out.println("Bienvenido a su Sistema de Ventas \n");
            System.out.println("Productos Disponibles: \n");

            for (int i = 0; i < productos.length; i++) {
                System.out.println(productos[i][0] + " - $" + productos[i][2] + " - " + productos[i][1]);
            }
            System.out.print("Seleccione alguno de los productos disponibles: ");
            int opt = sc.nextInt() - 1;
            System.out.print("\033[H\033[2J");

            if (opt != 1 || opt != 2 || opt != 3) {
                System.out.println("Usted Selecciono el producto: ");
                System.out.println(productos[opt][0] + " - $" + productos[opt][2] + " - " + productos[opt][1]);
                System.out.println("Desea agregar a su carrito? 1==SI 0==NO");
                int dec = sc.nextInt();
                if (dec == 1) {
                    System.out.println("Que cantidad desea llevar? ");
                    int qt = sc.nextInt();
                    double costo = qt * Double.valueOf(productos[opt][2]);
                    String[] seleccionado = { productos[opt][0], productos[opt][1], costo + "" };
                    carrito = Arrays.copyOf(carrito, carrito.length + 1);
                    carrito[carrito.length - 1] = seleccionado;
                } else if (dec == 0) {
                    System.out.println("No se agrego a su carrito de compras");
                }
                System.out.println("Desea seguir comprando otro producto? 1==SI 0==NO");
                int decc = sc.nextInt();
                double suma = 0;
                if (decc == 0 || dec != 1) {
                    System.out.println("Su carrito de compras: \n");
                    for (int i = 0; i < carrito.length; i++) {
                        System.out.println(carrito[i][0] + " - $" + carrito[i][2] + " - " + carrito[i][1]);
                        suma = suma + Double.valueOf(carrito[i][2]);
                    }
                    System.out.println("Su total a pagar es de: " + suma);
                    System.out.println("Efectivo: ");
                    System.out.println("Tarjeta de Crédito/Débito: \n\n");

                    System.out.println("Con que método desea pagar? 1==Efectivo 2==Tarjeta de Crédito/Débito");
                    int pago = sc.nextInt();

                    if (pago == 1) {
                        System.out.println("Ingrese la cantidad de efectivo recibida: ");
                        double efectivo = sc.nextDouble();
                        double cambio = efectivo - suma;
                        if (efectivo - suma == 0) {
                            System.out.println("No tiene que regresar cambio ");
                        } else if (efectivo - suma < 0) {
                            System.out.println("Le faltan: " + cambio + " pesos");
                        } else {
                            System.out.println("Su cambio es de: " + cambio);
                        }
                    } else if (pago == 2) {
                        System.out.println("Ingrese el número de su tarjeta o ingresela en la terminal: (sin espacios)");
                        String card = sc.nextLine();
                        if (card.length() == 12) {
                            System.out.println("Ingrese el PIN de su tarjeta.");
                            String pin = sc.nextLine();
                            if (pin.length() == 4) {
                                System.out.println("Pago completado!");
                                Arrays.fill(carrito, null);
                            } else {
                                System.out.println("Su PIN es incorrecto o debe tener 4 digitos.");
                            }
                        } else {
                            System.out.println("Su numero de tarjeta es incorrecto o debe tener 16 digitos.");
                        }
                    }
                }
            } else {
                System.out.println("El producto ingresado no existe intente de nuevo");
            }

        }
    }
}
