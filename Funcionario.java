public class Funcionario {
    private String nome;
    private double salario;
    private double custo;

    protected double getPERCENTUAL_CUSTO(){
        return 3.3;
    }

    public double getCusto() {
        return custo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        this.custo = salario * getPERCENTUAL_CUSTO();
    }
    public void setAumento(Double percentual){
        double mult = (100 + percentual)/ 100;
        this.setSalario(this.getSalario() * mult);
    }
    public void setAumento(String percentual){
        double d = Double.parseDouble(percentual);
        this.setAumento(d);
    }
    public void setAumento(){
        this.setAumento(8.2);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Olá meu nome é: "
                + this.nome + ". Eu recebo "
                + this.salario + " de salário."
                + " E tenho um custo de " + this.custo + " para a empresa!");
    }
    public void imprimir(Cabecalho cabecalho, Rodape rodape){
        cabecalho.imprimir();
        imprimir();
        rodape.imprimir();
    }
    public void imprimir(Cabecalho cabecalho){
        cabecalho.imprimir();
        imprimir();
    }
    public void imprimir(Rodape rodape){
        rodape.imprimir();
        imprimir();
    }

}