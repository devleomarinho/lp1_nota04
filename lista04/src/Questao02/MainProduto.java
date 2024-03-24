package Questao02;

public class MainProduto {

    public static void main(String[] args){

        Produto produto1 = new Produto("Camisa", 49.99, "Camisa polo azul");
        Produto produto2 = new Produto("Calça", 99.99, "Calça jeans preta");

        produto1.exibirInfo();
        produto2.exibirInfo();
    }
}
