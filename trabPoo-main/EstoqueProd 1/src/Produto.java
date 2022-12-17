import java.util.ArrayList;
import java.util.List;

public class Produto {

    //Atributos da superclasse
    private final String nomeProd;
    private final int codProd;
    private double valor;
    private double gramas;
    private static int qtdProd;


    //Estrutura de dados do programa
    protected static List<Produto> produtos = new ArrayList<>();

    public Produto( int codProd, String nomeProd, double valorVenda, double gramas) {
        this.nomeProd = nomeProd;
        this.codProd = codProd;
        this.valor = valorVenda;
        this.gramas = gramas;
        qtdProd++;
    }

    //Gets
    public String getNomeProd() {
        return nomeProd;
    }

    public int getCodProd() {
        return codProd;
    }

    public double getValor() {
        return valor;
    }
    public double getGramas() {return gramas; }


    //Metódos funcionais:

    // 1. Adicionar produto
    protected static void adicionarProduto() {
        int sessaoProd = Util.scanInt("Digite a sessão do produto - 1(Biscoito), 2(Pipoca), 3(Salgadinho): "
                , "Mensagem inválida");

        switch (sessaoProd) {
            case 1 -> {
                int codProd = Util.scanInt("Digite o código do produto: ", "Código inválido!");
                String nomeProd = Util.scanString("Digite o nome do produto que deseja adicionar: ");
                double valorVenda = Util.scanDouble("Digite o valor do produto: ", "Valor inválido: ");
                double gramas = Util.scanDouble("Digite o Peso do Produto", "Erro por favor apenas números");
                Biscoito b = new Biscoito(codProd, nomeProd, valorVenda, gramas);
                produtos.add(b);
                System.out.println("\n O produto " + b.getNomeProd() + " foi adicionado com Sucesso. \n");
                break;
            }
            case 2 -> {
                int codProd = Util.scanInt("Digite o código do produto: ", "Código inválido!");
                String nomeProd = Util.scanString("Digite o nome do produto que deseja adicionar: ");
                double valorVenda = Util.scanDouble("Digite o valor do produto: ", "Valor inválido: ");
                double gramas = Util.scanDouble("Digite o peso do Produto", "Digite apenas números");
                Pipoca p = new Pipoca(codProd, nomeProd, valorVenda, gramas);
                produtos.add(p);
                System.out.println("\n O produto " + p.getNomeProd() + " foi adicionado com Sucesso. \n");
                break;
            }
            case 3 -> {
                int codProd = Util.scanInt("Digite o código do produto: ", "Código inválido!");
                String nomeProd = Util.scanString("Digite o nome do produto que deseja adicionar: ");
                double valorVenda = Util.scanDouble("Digite o valor do produto: ", "Valor inválido: ");
                double gramas = Util.scanDouble("Digite o peso do Produto", "Digite apenas números");
                Salgadinho s = new Salgadinho(codProd, nomeProd, valorVenda, gramas);
                produtos.add(s);
                System.out.println("\n O produto " + s.getNomeProd() + " foi adicionado com Sucesso.\n");
                break;
            }
            default -> {
                System.out.println("Opção inválida!");
                break;
            }

        }
    }
    // 2. Deletar produto
    protected static void deletarProduto() {
        int sessaoProd = Util.scanInt("Digite a sessão do produto - 1(Biscoito), 2(Pipoca), 3(Salgadinho): "
                ,"Mensagem inválida");


            switch (sessaoProd) {
                case 1 -> {
                    int codProd = Util.scanInt("Digite o código do produto que deseja deletar: ",
                            "Código inválido");
                    Produto p = buscarProduto(codProd, "Digite a código do produto que deseja deletar: ");
                    Biscoito.setQtdBiscoito(Biscoito.getQtdBiscoito()-1);
                    Biscoito.biscoitos.remove(p.getNomeProd());
                    System.out.println("O produto " + p.getNomeProd() + " foi deletado com Sucesso.");
                    produtos.remove(p);
                    break;
                }
                case 2 -> {
                    int codProd = Util.scanInt("Digite o código do produto que deseja deletar: ",
                            "Código inválido");
                    Produto p = buscarProduto(codProd, "Digite a código do produto que deseja deletar: ");
                    Pipoca.setQtdPipoca(Pipoca.getQtdPipoca()-1);
                    Pipoca.pipocas.remove(p.getNomeProd());
                    System.out.println("O produto " + p.getNomeProd() + " foi deletado com Sucesso.");
                    produtos.remove(p);
                    break;
                }
                case 3 -> {
                    int codProd = Util.scanInt("Digite o código do produto que deseja deletar: ",
                            "Código inválido");
                    Produto p = buscarProduto(codProd, "Digite a código do produto que deseja deletar: ");
                    Salgadinho.setQtdSalg(Salgadinho.getQtdSalg()-1);
                    Pipoca.pipocas.remove(p.getNomeProd());
                    System.out.println("O produto " + p.getNomeProd() + " foi deletado com Sucesso.");
                    produtos.remove(p);
                    break;
                }
                default -> {
                    System.out.println("Opção inválida!");
                    break;
                }
            }

        Produto.qtdProd --;
    }


    // 3. Imprimir informações do produto
    protected static void infoProduto() {
        int codProd = Util.scanInt("Digite o código do produto que deseja ver os dados: ",
                "Código inválido!");
        Produto p = buscarProduto(codProd, "Digite o código do produto que deseja ver os dados: ");
        p.imprimir();
    }


    // 4. Atualizar valor do produto
    protected static void atualizarProduto() {
        int codProd = Util.scanInt("Digite o código do produto que deseja atualizar: ",
                "Código inválido");
        Produto p = buscarProduto(codProd, "Digite o código do produto que deseja atualizar: ");
        System.out.println("Produto: " + p.getNomeProd() + ", valor: " + p.getValor());
        double novoValor = Util.scanDouble("Digite o novo valor do produto: ",
                "Valor inválido");
        System.out.println("Agora o produto: " + p.getNomeProd() + ", custa: " + novoValor + ".");
    }


    //5. Imprimir reltório do estoque
    protected static void imprimirRelatorioDeestoque(){

        System.out.println("\n Produtos em estoque: " + qtdProd +
                "\n Biscoitos: " + Biscoito.getQtdBiscoito() + "." +
                "\n Pipocas: " + Pipoca.getQtdPipoca() + "." +
                "\n Salgadinho: " + Salgadinho.getQtdSalg() + ".\n");

    }


    //6. Imprimir relatório de sessão
    protected static void imprimirRelatorioDeSessao() {

        int sessaoProd = Util.scanInt("Digite a sessão do produto - 1(Biscoito), 2(Pipoca), 3(Salgadinho): "
                , "Mensagem inválida");


        /* COLOQUE O SWIFT CASE NOS LUGARES DESSES IFS E ELSES */

        switch (sessaoProd) {
            case 1 -> {
                Biscoito.imprimirRelatorioBiscoitos();
                break;
            }
            case 2 -> {
                Pipoca.imprimirRelatorioPipoca();
                break;
            }
            case 3 -> {
                Salgadinho.imprimirRelatorioSalgadinho();
                break;
            }
            default -> {
                System.out.println("Opção inválida!");
                break;
            }
        }
    }

    //Métodos auxiliares

    // 1. Buscar produto

    protected static Produto buscarProduto(int codProd, String mensagem) {

        Produto produtoBuscado = null;
        while (produtoBuscado == null) {
            for (Produto p: Produto.produtos){
                if(p.getCodProd() == codProd){
                    produtoBuscado = p;
                }
            }
            if (produtoBuscado == null){
                System.out.println("Produto não encontrado!");
                codProd = Util.scanInt(mensagem, "Código inválido!");
            }
        }

        return produtoBuscado;
    }

    //2. Apresentação do programa
    protected static void apresentacao() {

        System.out.println(
                "Bem vindo ao controle de estoque de produtos: \n"
                        + "O que você deseja fazer? \n"
                        + "1. Adicionar produto. \n"
                        + "2. Deletar produto. \n"
                        + "3. Ver informações do produto. \n"
                        + "4. Atualizar valor do produto. \n"
                        + "5. Imprimir relatório de estoque. \n"
                        + "6. Imprimir relatório de sessão. \n"
                        + "7. Para sair do programa. \n"
        );

    }

    //3. Imprimir dados do produto
    public void imprimir(){
        System.out.println(
                "\n Produto: " + this.getNomeProd()
                        + ", tem o código: " + this.getCodProd()
                        + ", e valor de: R$" + this.getValor() +"\n"
        );
    }

}