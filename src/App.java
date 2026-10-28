
import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos();
        runEjemplosObjetos();
    }

    private static void runEjemplosObjetos() {
        Estudiante e1 = new Estudiante("Juan", 10);

        Estudiante[] estudiantes = {
            e1,
            new Estudiante("Pedro", 9),
            new Estudiante("Maria", 8),
            new Estudiante("Ana", 7)
        };

        Bubble bubble = new Bubble();

        System.out.println("Estudiantes originales:");
        printArreglo(estudiantes);

        bubble.sortEstudiantes(estudiantes);

        System.out.println("Estudiantes ordenados:");
        printArreglo(estudiantes);
    }

    public static void runEjemplosPrimitivos() {
        int[] original = {5, 6, 4, 1, 2, 3};

        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        // Bubble Sort
        System.out.println("Bubble");
        Bubble bubble = new Bubble();
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        // Selection Sort
        System.out.println("Selection");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        // Insertion Sort
        System.out.println("Insertion");
        InsertionSort insertion = new InsertionSort();
        printArreglo(d);
        insertion.sort(d);
        printArreglo(d);
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }

    public static void printArreglo(Estudiante[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }
}
