import java.util.Scanner;

public class Application {

    // Criar base de dados
    public static void criarBaseDeDados(){
        Biscoito treloso = new Biscoito(1, "Treloso 130g", 1.99, 90);
        Produto.produtos.add(treloso);

        Biscoito bono = new Biscoito(2, "Bono 100g", 4.99, 90);
        Produto.produtos.add(bono);

        Biscoito futurinhos = new Biscoito(3, "Futurinhos 130g", 1.99, 90);
        Produto.produtos.add(futurinhos);

        Pipoca bokus = new Pipoca(4, "Bokus 30g", 0.99, 90);
        Produto.produtos.add(bokus);

        Pipoca karinto = new Pipoca(5, "Karinto 30g", 0.99, 90);
        Produto.produtos.add(karinto);

        Pipoca kibeleza = new Pipoca(6, "Kibeleza 30g", 0.99, 90);
        Produto.produtos.add(kibeleza);

        Salgadinho pipos = new Salgadinho(7, "Pipos 30g", 1.99, 90);
        Produto.produtos.add(pipos);

        Salgadinho doritos = new Salgadinho(8, "Doritos 30g", 4.99, 90);
        Produto.produtos.add(doritos);

        Salgadinho baconzitos = new Salgadinho(9, "Baconzitos 30g", 6.99, 90);
        Produto.produtos.add(baconzitos);

    }


    public static void main(String[] args) {
        //Estrutura para funcionamento do programa

        Scanner sc = new Scanner(System.in);
        criarBaseDeDados();

        //Funcionalidades

        Integer acao =0;
        while (acao !=7){
            Produto.apresentacao();
            acao = sc.nextInt();


            switch (acao) {
                case 1 ->{
                    Produto.adicionarProduto();
                    break;
                }case 2 ->{
                    Produto.deletarProduto();
                    break;
                }case 3->{
                    Produto.infoProduto();
                    break;
                }case 4 ->{
                    Produto.atualizarProduto();
                    break;
                }
                case 5 ->{
                    Produto.imprimirRelatorioDeestoque();
                    break;
                }case 6->{
                    Produto.imprimirRelatorioDeSessao();
                    break;
                }case 7 ->{
                    System.out.println("Você fechou o Programa !");
                    break;
                }
                default ->{
                    System.out.println("Ação inválida!");
                    break;
                }
            }

        }
    }
}