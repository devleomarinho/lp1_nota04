package Questao03;

public class Carro {
    String marca, modelo;

    public Carro(String marca, String modelo){
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }

    public void mostrarDetalhes(){
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo());
        System.out.println("*".repeat(50));
    }
}
