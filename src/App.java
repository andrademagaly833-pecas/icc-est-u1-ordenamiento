public class App {
    public static void main(String[] args) throws Exception {

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
        InsertionSort insertion = new InsertionSort();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);
        System.out.println("\n--- Selection Insertion ---\n");
        System.out.println("Original:");
        printArreglo(d);
        
        insertion.sort(d);
        System.out.println("Ordenado Des:");
        printArreglo(d);
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }
}