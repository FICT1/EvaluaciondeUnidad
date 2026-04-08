package modelos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();

        System.out.print("Ingrese cantidad de productos: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nProducto #" + (i + 1));

            System.out.print("Codigo: ");
            String codigo = sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Precio: ");
            float precio = sc.nextFloat();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            Producto p = new Producto(codigo, nombre, precio, cantidad);
            inventario.agregarProducto(p);
        }

        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        inventario.mostrarProductos();

        System.out.println("\nTOTAL INVENTARIO: " + inventario.calcularTotalInventario());
    }
}