package Questao04;

public class Leao extends Animal{
    private String pelo;

    public Leao(String classe, String locomocao, String pelo){
        super(classe, locomocao);
        this.pelo = pelo;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public void exibirInformacoes(){
        System.out.println("Classe: " + getClasse() + "\nLocomoção: " + getLocomocao() + "\nTipo de Pelagem: " + getPelo());
    }
}
