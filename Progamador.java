public class Programador extends Funcionario{
    private String linguagens;

    public String getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }
    protected double getPERCENTUAL_CUSTO(){
        return 4.4;
    }
    public void imprimir() {
        System.out.println("Olá meu nome é: "
                + getNome() + ". Eu recebo "
                + getSalario() + " de salário."
                + " E tenho um custo de " + getCusto() + " para a empresa!" + " E tenho habilidades em " + getLinguagens());
    }
}