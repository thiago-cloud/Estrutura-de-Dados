public class Banco{

    public static void main(String args[]){
         
        Fila f;
        int e;
        f = new Fila();

        f.inserir(176);
        f.inserir(914);
        f.inserir(1001);
        f.inserir(1549);
        f.inserir(2003);

        System.out.println("Bem vindo ao Bank-Of-American");
        System.out.println("Servindo sempre ao seu cliente como se fosse se filho");
        System.out.println("Atendimento!");
        System.out.println("-------------------------------------------------------");
        while(!f.isEmpty()){
            e = f.retirar();
            System.out.println("Senha a ser atendida no guiche: "+e);
        }
    }
   


}