package Busca_Sequencial;

public class Colecao {
    
    // A ideia é a busca retornar um dos elementos do array de acordo com posição
    private  int valores[] = {12, 23, 56, 87, 96, 90, 208};

    public int buscaSequencial(int val){
        int iteracoes = 0;
        int pos;
        for (pos = 0 ; pos < valores.length ; pos++){
            if(val == valores[pos]){
                System.out.println("Iterações= "+iteracoes);
                return pos; // Restorna a localização exata de onde o elemento se encontra
            }
            iteracoes++;
        }
        System.out.println("Iterações= "+iteracoes);
        return -1;
    }

    // Busca Binaria
    public int buscaBinaria(int val){
        int inicio, meio, fim, iteracoes=0;
        inicio = 0;
        fim = valores.length-1;

        while(inicio <= fim){
            meio = (inicio + fim)/2;
            if(val == valores[meio]){
                return meio;
            }else{
                if(val > valores[meio]){
                    System.out.println("Iterações= "+iteracoes);
                    inicio = meio+1;
                }else{
                    fim = meio - 1;
                }
            }
        }
        return  -1;
    }

}
