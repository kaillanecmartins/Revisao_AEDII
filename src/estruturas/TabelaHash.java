package estruturas;

public class TabelaHash {
    private HashNodo[] baldes;
    private int numBaldes;
    private int tamanho;
    
    public TabelaHash(){
        this(10);
    }
    public TabelaHash(int capacidade){
        this.numBaldes = capacidade;
        baldes = new HashNodo[numBaldes];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public boolean isEmpty(){
        return tamanho == 0;
    }
    
    public int getBaldeIndex(int chave){
        return chave % baldes.length;
    }
    
    public void inserir(int chave, String valor){
        int index = getBaldeIndex(chave);
        HashNodo raiz = baldes[index];
        while(raiz != null){
            if(raiz.getChave() == chave){
                raiz.setValor(valor);
                return;
            }
            raiz = raiz.getProximo();
        }
        tamanho++;
        raiz = baldes[index];
        HashNodo nodo = new HashNodo(chave, valor);
        nodo.setProximo(raiz);
        baldes[index] = nodo;
    }
    
    public String buscar(int chave){
        int index = getBaldeIndex(chave);
        HashNodo raiz = baldes[index];
        while(raiz != null){
            if(raiz.getChave() == chave){
                return raiz.getValor();
            }
            raiz = raiz.getProximo();
        }
        
        return null;
    }
    
    public String remover(int chave){
        int index = getBaldeIndex(chave);
        HashNodo raiz = baldes[index];
        HashNodo possivel = null;
        while(raiz != null){
            if(raiz.getChave() == chave){
                break;
            }
            possivel = raiz;
            raiz = raiz.getProximo();
        }
        if(raiz == null){
            return null;
        }
        tamanho--;
        if(possivel != null){
            possivel.setProximo(raiz.getProximo());
        }else{
            baldes[index] = raiz.getProximo();
        }
        return raiz.getValor();
    }
}
