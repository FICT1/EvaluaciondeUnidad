package modelo;

public class Gestion {

    // Atributos del estudiante
    private String codigo;
    private String nombre;
    private String carrera;
    private double promedio;

    // CONSTRUCTOR: Se llama igual que la clase (Gestion)
    public Gestion(String codigo, String nombre, String carrera, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Método para determinar si aprueba o reprueba (>= 70)
    public String determinarEstado() {
        if (this.promedio >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("-------------------------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + determinarEstado());
    }

    // Getter para obtener el promedio en la clase principal
    public double getPromedio() {
        return promedio;
    }
}