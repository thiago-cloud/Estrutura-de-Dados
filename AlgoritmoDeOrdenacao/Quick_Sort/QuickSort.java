package AlgoritmoDeOrdenacao.Quick_Sort;

public class QuickSort {
    
    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = particionar(arr, inicio, fim);
            quickSort(arr, inicio, pivoIndex - 1); // Ordena a parte esquerda
            quickSort(arr, pivoIndex + 1, fim);    // Ordena a parte direita
        }
    }

    private static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim]; // Escolhe o último elemento como pivô
        int i = inicio - 1;  // Índice do menor elemento

        for (int j = inicio; j < fim; j++) {
            if (arr[j] < pivo) { // Se o elemento atual for menor que o pivô
                i++;
                trocar(arr, i, j);
            }
        }
        trocar(arr, i + 1, fim); // Coloca o pivô na posição correta
        return i + 1; // Retorna a posição do pivô
    }

    private static void trocar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
