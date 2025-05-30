public class Caixa{
    private int elemento;
    private Caixa proximo;// O proximo será como ser fosse um ponteiro(referencia) apontando para ultima caixas

    public void setElemento(int elemento){
        this.elemento = elemento;
    }

    public int getElemento(){
        return this.elemento;
    }

    public void setProximo(Caixa proximo){
        this.proximo = proximo;
    }

    public Caixa getProximo(){
        return this.proximo;
    }
}