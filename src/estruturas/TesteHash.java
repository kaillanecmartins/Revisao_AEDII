package estruturas;

public class TesteHash {
    public static void main(String[] args) {
        TabelaHash tb = new TabelaHash();
        tb.inserir(105, "harry");
        tb.inserir(21, "Amanda");
        //tb.inserir(21, "pedro");
        tb.inserir(40, "ana");
        
        System.out.println(tb.getTamanho());
        System.out.println(tb.buscar(21));
        System.out.println(tb.remover(21));
        System.out.println(tb.buscar(20));
        System.out.println(tb.getTamanho());
    }
}
