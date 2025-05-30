public class Pilha{
    private int valores[]; //Array
    private int topo; // Variavel que indica qual numero ta no topo

    public Pilha(){
        valores = new int[1000];// valor limite do numero pode ser até 1000 
        topo = -1; // Indica que a pilha está vazia ou seja na array o topo começa na posição 0 da array o -1 indica que não houve começo
    }

    public void push(int elemento){
        topo = topo + 1;
        valores[topo] = elemento;
    }

    public boolean isEmpty(){
        return (topo == -1); // Se o topo for igual -1 retorne true ou seja a pilha está vazia
    }

    public boolean isFull(){
        return (topo == 9); // Indicar que a pilha está cheia na posição 9
    }

    public int pop(){
        int elem = valores[topo];
        topo--;// Vai eleminando um elemento e descendo a pilha
        return elem;
    }

}