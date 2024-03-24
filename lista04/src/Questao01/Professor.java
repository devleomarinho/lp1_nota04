package Questao01;

public class Professor extends Pessoa{
    private double salario;

    public Professor(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + " anos\nSalário: R$" + getSalario());
    }
}
