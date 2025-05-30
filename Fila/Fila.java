// Variavéis de Inicio e Fim
// Variavel Total
// Quando a fila está cheia?
    // Total = tamanho do vetor
// Quando a fila está vazia
    // Total = 0

public class Fila{
    private int[] valores;
    private int inicio;
    private int fim;
    private int total;

        public Fila(){
        valores = new int[10];
        inicio = 0;
        fim = 0;
        total = 0;
    }

    public void inserir(int elemento){
        valores[fim] = elemento;
        fim = (fim + 1 ) % 10;
        total++;
    }

    public int retirar(){
        int elemento = valores[inicio];
        inicio = (inicio + 1) % 10;
        total--;
        return elemento;
    }

    public boolean isEmpty(){
        return (total == 0);
    }

}

