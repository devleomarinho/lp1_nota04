package Questao01;

public class Aluno extends Pessoa{
    private int mat;

    public Aluno(String nome, int idade, int mat){
        super(nome, idade);
        this.mat = mat;

    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + " anos\nMatrícula: " + getMat());
    }
}
