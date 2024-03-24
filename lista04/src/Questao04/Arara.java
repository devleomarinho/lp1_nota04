package Questao04;

public class Arara extends Animal{
    private String qtDeOvos;

    public Arara(){
        super("Ave", "Asas");
        this.qtDeOvos = "2 a 4 por ninhada";
    }

    public String getQtDeOvos() {
        return qtDeOvos;
    }

    public void setQtDeOvos(String qtDeOvos) {
        this.qtDeOvos = qtDeOvos;
    }
}
