package estruturas;

public class HashNodo {
    private int chave;
    private String valor;
    private HashNodo proximo;
    
    public HashNodo(int chave, String valor){
        this.chave = chave;
        this.valor = valor;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public HashNodo getProximo() {
        return proximo;
    }

    public void setProximo(HashNodo proximo) {
        this.proximo = proximo;
    }
    
    
}
