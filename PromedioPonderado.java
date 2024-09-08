import java.util.Scanner;

public class PromedioPonderado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de materias: ");
        int numMaterias = scanner.nextInt();

        int[] creditos = new int[numMaterias];
        int[] calificaciones = new int[numMaterias];

        for (int i = 0; i < numMaterias; i++) {
            System.out.print("Introduce los créditos de la materia " + (i + 1) + ": ");
            creditos[i] = scanner.nextInt();
            System.out.print("Introduce la calificación de la materia " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        double promedio = calcularPromedioPonderado(creditos, calificaciones);

        System.out.printf("El promedio ponderado es: %.2f%n", promedio);
    }

    public static double calcularPromedioPonderado(int[] creditos, int[] calificaciones) {

        int sumaPonderacion = 0;
        int sumaCreditos = 0;

        for (int i = 0; i < creditos.length; i++) {
            sumaPonderacion += creditos[i] * calificaciones[i]; 
            sumaCreditos += creditos[i]; 
        }

        return (double) sumaPonderacion / sumaCreditos;
    }
}
