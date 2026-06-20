public class Main {
    public static void main(String[] args) {
        // Variable para evaluar la condición
        int puntos = 120;
        
        // Estructura condicional para tomar una decisión
        if (puntos >= 100) {
            System.out.println("¡Felicidades! Pasaste de nivel.");
        } else {
            System.out.println("Sigue intentándolo, necesitas más puntos.");
        }
        
        // Espacio en blanco en la consola
        System.out.println();
        
        // Estructura de control repetitiva (Bucle for)
        for (int i = 1; i <= 3; i++) {
            System.out.println("Cargando zona " + i + "...");
        }
    }
}
