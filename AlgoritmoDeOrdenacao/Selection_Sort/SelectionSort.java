package AlgoritmoDeOrdenacao.Selection_Sort;

public class SelectionSort {
    private int vetor[] = { 25, 57, 48, 37, 12, 92, 33};
    
    public void selectionSort(){
        
    int it, temp;
    int posMenorInicial;
    int posMenor;
    int i;

    for(it = 0; it < vetor.length-1 ; it++){
        posMenorInicial = it;
        posMenor = it + 1;
        for(i = posMenorInicial +1 ; i < vetor.length ; i++){
            if (vetor[i] < vetor[posMenor]){
                posMenor = 1;
                } 
            }
            System.out.println("Menor elemento encontrado na interação está na posição"+posMenor);
            if(vetor[posMenor] < vetor[posMenorInicial]){
                // troca
                temp = vetor[posMenorInicial];
                vetor[posMenorInicial] = vetor[posMenor];
                vetor[posMenor] = temp;
            }
            System.out.println("Iteração: "+it);
            mostrarVetor();
        }

    }

    public void mostrarVetor() {
        for(int var1 = 0; var1 < this.vetor.length; ++var1) {
           System.out.println(this.vetor[var1]);
        }
  
        System.out.println("");
     }
    
}
