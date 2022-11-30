public class Rodape {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void imprimir(){
        System.out.println(this.getText());
    }
}