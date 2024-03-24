package Questao02;

public class Produto {
    protected String tipo, desc;
    protected double preco;


    public Produto(String tipo, double preco, String desc){
        super();
        this.tipo = tipo;
        this.desc = desc;
        this.preco = preco;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInfo(){
        System.out.println("Produto: " + getTipo() + "\nDescrição: " + getDesc() + "\nPreço: R$" + getPreco());
        System.out.println("*".repeat(50));
    }
}
