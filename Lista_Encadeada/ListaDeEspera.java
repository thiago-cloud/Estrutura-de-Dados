public class ListaDeEspera{
    public static void main(String args[]){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(872);
        lista.inserir(123);
        lista.inserir(52);
        lista.inserir(3);
    
        lista.listar();

        while(!lista.isEmpty()){
            int e = lista.retirar();
            System.out.println("Retirei um elemento "+e);
        }
    }
}