public class Application {
    public static void main(String[] args) {

        Programador programador = new Programador();
        Cabecalho cabecalho = new Cabecalho();
        Rodape rodape = new Rodape();
        programador.setNome("Leandro Cassimiro R de Oliveira");
        programador.setSalario(3446);
        programador.setAumento(8.2);
        programador.setLinguagens("Java , JS.");
        cabecalho.setText1("Dados do programador");
        rodape.setText("Fim da pag.");
        programador.imprimir(cabecalho, rodape);



        /*Secretaria secretaria = new Secretaria();
        secretaria.setNome("Paula");
        secretaria.setSalario(34446);
        secretaria.setAumento("8.2");
        secretaria.setAgenda("Segunda, quarta e sexta. ");
        secretaria.imprimir();

        Gerente gerente = new Gerente();
        gerente.setNome("VENOM ");
        gerente.setSalario(5000);
        gerente.setAumento(8.2);
        gerente.setSubordinados("Thak, Jp. ");
        gerente.imprimir();*/
    }
}