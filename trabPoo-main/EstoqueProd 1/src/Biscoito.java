import java.util.ArrayList;
import java.util.List;

public class Biscoito extends Produto{

    //Atributos da subclasse
    public static int qtdBiscoito;


    //Lista da sessão
    public static List<String> biscoitos = new ArrayList<>();

    //Construtor da subclasse
    public Biscoito(int codProd, String nomeProd, double valorVenda, double gramas) {
        super(codProd, nomeProd, valorVenda, gramas);
        qtdBiscoito++;
        biscoitos.add(nomeProd);
    }

    //Get e set
    public static int getQtdBiscoito() {
        return qtdBiscoito;
    }

    public static void setQtdBiscoito(int qtdBiscoito) {
        Biscoito.qtdBiscoito = qtdBiscoito;
    }


    //Métodos auxiliares da subclasse

    //1. Imprimir informações do produto
    public void imprimir(){
        System.out.println(
                "\n Biscoito: " + this.getNomeProd()
                        + ", tem o código: " + this.getCodProd()
                        + ", e valor de: R$" + this.getValor()
                        + "O peso e: " + this.getGramas() +"\n"
        );
    }

    //2. Imprimir informações da sessão
    public static void imprimirRelatorioBiscoitos(){
        System.out.println("\n Biscoitos em estoque (" + qtdBiscoito + "): " + biscoitos + "\n");
    }
}