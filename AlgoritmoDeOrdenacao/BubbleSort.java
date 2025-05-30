package AlgoritmoDeOrdenacao;

public class BubbleSort {
    private int vetor[] = { 25, 57, 48, 37, 12, 92, 33};

    public void bubbleSort(){
        int it;  // Numero de iterações
        int pos; // Sempre uso a posição atual
        int temp; // Variavel para trocar

        for(it = 0; it < vetor.length-1; it++){
            for(pos = 0; pos < vetor.length - it-1; pos++){
                //Comparo o elemento da posição com o seu proximo
                if(vetor[pos] > vetor[pos+1]){ // O elemento atual é maior que seu próximo?
                    // entao troca
                    temp         = vetor[pos];
                    vetor[pos]   = vetor[pos+1];
                    vetor[pos+1] = temp;
                }
            }
            System.out.println("--------------------->Final da iteração "+it);
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
