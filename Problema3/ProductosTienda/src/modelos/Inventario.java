package modelos;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public float calcularTotalInventario() {
        float total = 0;
        for (Producto p : productos) {
            total += p.calcularMonto();
        }
        return total;
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}