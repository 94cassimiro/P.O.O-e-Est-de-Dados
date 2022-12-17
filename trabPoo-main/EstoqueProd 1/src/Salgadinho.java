import java.util.ArrayList;
import java.util.List;

public class Salgadinho extends Produto{

    //Atributos da subclasse
    public static int qtdSalg;


    //Lista da sessão
    public static List<String> salgadinhos = new ArrayList<>();


    //Construtor da subclasse
    public Salgadinho(int codProd, String nomeProd, double valorVenda, double gramas) {
        super(codProd, nomeProd, valorVenda, gramas);
        qtdSalg ++;
        salgadinhos.add(nomeProd);
    }

    //Get e set
    public static int getQtdSalg() {
        return qtdSalg;
    }

    public static void setQtdSalg(int qtdSalg) {
        Salgadinho.qtdSalg = qtdSalg;
    }


    //Métodos auxiliares da subclasse

    //1. Imprimir informações do produto
    public void imprimir(){
        System.out.println(
                "\n Salgadinho: " + this.getNomeProd()
                        + ", tem o código: " + this.getCodProd()
                        + ", e valor de: R$" + this.getValor() +"\n"
                        + "O peso e: " + this.getGramas() +"\n"
        );
    }

    //2. Imprimir informações da sessão
    public static void imprimirRelatorioSalgadinho(){
        System.out.println("\n Salgadinhos em estoque (" + qtdSalg + "): " + salgadinhos + "\n");
    }
}
