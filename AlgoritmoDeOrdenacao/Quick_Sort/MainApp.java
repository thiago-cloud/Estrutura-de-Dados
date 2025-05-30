package AlgoritmoDeOrdenacao.Quick_Sort;

public class MainApp {
    public static void main(String[] args) {
        int[] lista = {5, 3, 8, 4, 2, 7, 1, 6};
        quickSort(lista, 0, lista.length - 1);

        System.out.print("Array ordenado: ");
        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}
