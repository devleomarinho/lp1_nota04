package Questao03;

public class MainCarro {
    public static void main(String[] args){

        Carro carro01 = new Carro("Toyota", "Corolla");
        Carro carro02 = new Carro("Ford", "Ka");
        Carro carro03 = new Carro("Hyunday", "HB20");

        carro01.mostrarDetalhes();
        carro02.mostrarDetalhes();
        carro03.mostrarDetalhes();
    }
}
