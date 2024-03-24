package Questao01;

public class AcademicoMain {

    public static void main(String[] args){

        Aluno aluno01 = new Aluno("Zé Ramalho", 21, 20232100);
        Professor prof01 = new Professor("Bob Dylan", 50, 4100);

        aluno01.mostrarInfo();
        prof01.mostrarInfo();
    }
}
