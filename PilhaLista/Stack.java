package PilhaLista;

// Node ou no ou bloco ou caixa 

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return top == null;
    }

    // Método para empilhar um elemento
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " empilhado");
    }

    // Método para desempilhar um elemento
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia! Não é possível desempilhar.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // Método para obter o topo da pilha sem remover
    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return top.data;
    }

    // Método para exibir a pilha
    public void display() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return;
        }
        Node temp = top;
        System.out.print("Topo -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
