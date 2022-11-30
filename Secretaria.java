public class Secretaria extends Funcionario {
    private String agenda;

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }
    public void imprimir() {
        System.out.println("Olá meu nome é: "
                + getNome() + ". Eu recebo "
                + getSalario() + " de salário."
                + " E tenho um custo de " + getCusto() + " para a empresa!" + " Minha agenda " + getAgenda());
    }

}