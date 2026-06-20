// Clase encapsulada que representa el molde de un Estudiante
class Estudiante {
    // Atributos privados: no se pueden modificar directamente desde fuera
    private String nombre;
    private int nota;

    // Constructor de la clase
    public Estudiante(String nombreInicial, int notaInicial) {
        this.nombre = nombreInicial;
        this.nota = notaInicial;
    }

    // Métodos de acceso seguros (Getters)
    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creación de un arreglo (array) con capacidad para 2 objetos Estudiante
        Estudiante[] lista = new Estudiante[2];

        // Instanciación y almacenamiento de objetos dentro de los cajones del arreglo
        lista[0] = new Estudiante("Luis", 16);
        lista[1] = new Estudiante("Sofia", 10);

        System.out.println("=== REPORTE FINAL DE RENDIMIENTO ===");

        // Bucle for para recorrer el arreglo de forma automatizada
        for (int i = 0; i < lista.length; i++) {
            // Estructura condicional que evalúa la nota usando el método getter
            if (lista[i].getNota() >= 11) {
                System.out.println("Estudiante: " + lista[i].getNombre() + " | Nota: " + lista[i].getNota() + " -> APROBADO");
            } else {
                System.out.println("Estudiante: " + lista[i].getNombre() + " | Nota: " + lista[i].getNota() + " -> REQUIERE RECUPERACIÓN");
            }
        }
        System.out.println("====================================");
    }
}
