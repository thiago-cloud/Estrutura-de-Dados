package AlgoritmoDeOrdenacao.Insert_Sort;

public class InsertSort {
    private int vetor[] = { 25, 57, 48, 37, 12, 92, 33};
    
    public void insertSort(){
        int carta, it, j;
        // A interação vai selecionar a carta(elemento) e ai será puxada a carta menor para o lado esquerdo
        for(it = 1; it < vetor.length; it++){
            carta = vetor[1];// Guarda a carta
            for(j = it-1; (j>=0) && vetor[j] > carta; j--){
                vetor[j] = vetor[j+1]; // Estou trocando todos que são maiores do que eu
            }
            vetor[j+1] = carta;
            System.out.println("---------------------Iteração "+it);
            mostrarVetor();
        }
    }

    public void mostrarVetor(){
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("");
    }
}
