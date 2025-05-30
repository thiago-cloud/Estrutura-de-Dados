
import java.util.Scanner;

// Conversor para numeros binarios

public class Conversor {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //int number = Integer.parserInt(args[0]);
        Pilha p = new Pilha();
        int resto;

        System.out.println("Digite um numero: ");
        int number = input.nextInt();

        while(number != 0){
            resto = number % 2;
            p.push(resto);
            number = number / 2;
        }
       
       //Exibição do resto
       while(!p.isEmpty()){
        resto = p.pop(); // Remove da pilha o elemento do topo
        System.out.println(resto);
       }

    }
}