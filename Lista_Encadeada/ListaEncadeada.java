// lista encadeada -> E uma lista com que contém elementos e cada elemento tem uma referencia como se fosse uma etiqueta mostrando qual
// será o proximo elemento

// A lista encadead possibilita que alocar memória sob demanda.

// Lista que inseri e retira elementos
    /*
        * Inseri elementos
        * Retira elementos
        * Lista todos os elementos
     */

public class ListaEncadeada{

    private Caixa inicio;

    // A lista inicia vazia
    public ListaEncadeada(){
        this.inicio = null;
    }
    
    public void inserir(int elemento){
        // tenho que criar uma nova caixa
        Caixa nova = new Caixa();
        nova.setElemento(elemento); //Inserindo o elemento na caixa
        nova.setProximo(null); // Depois dela não vem ninguém
        
        if (inicio == null ){ // Vai ser a 1a Caixa
            inicio = nova;
        }
        else{   // Já tem gente na lista
            Caixa aux;
            aux = inicio;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }

    public int retirar(){
        // Este método considera que a lista sempre tem elementos
        // Alguém na aplicação precisa (antes de remover), testar se a lista não está vazia, ok?
        
        Caixa aux = inicio;// Caixa aux recebe inicio
        int elemento = aux.getElemento();
        inicio = aux.getProximo();
        return elemento;
    }

    public void listar(){

        if(inicio == null){
            System.out.println("Nada a exibir a lista está vazia! ");
        }else{
            Caixa aux = inicio;
            while(aux != null){
                System.out.println("Elemento vazio "+aux.getElemento());
                aux = aux.getProximo();
            }
        }

    }

    public boolean isEmpty(){
        return this.inicio == null;
    }

}
