package PilhaLista;


public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        
        System.out.println("Elemento desempilhado: " + stack.pop());
        stack.display();
        
        System.out.println("Topo da pilha: " + stack.peek());
    }
}
