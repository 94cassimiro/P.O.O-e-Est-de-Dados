public class Gerente extends  Funcionario {
    private String subordinados;

    public String getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(String subordinados) {
        this.subordinados = subordinados;
    }
    public void imprimir() {
        System.out.println("Olá meu nome é: "
                + getNome() + ". Eu recebo "
                + getSalario() + " de salário."
                + " E tenho um custo de " + getCusto() + " para a empresa!" +
                " Meus subordinados são " + getSubordinados());
    }
}