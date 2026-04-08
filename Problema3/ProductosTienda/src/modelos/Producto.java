package modelos;

public class Producto {

    private String codigo;
    private String nombre;
    private float precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(String codigo, String nombre, float precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public float calcularMonto() {
        return precio * cantidad;
    }

    public boolean disponible() {
        return cantidad > 0;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", monto=" + calcularMonto() +
                ", disponible=" + disponible() +
                '}';
    }


}
