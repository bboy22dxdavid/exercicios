package ExercicioPOO.Models;
/*
* Criando objeto carro com os metodos
* */
public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro() {
    }

    public void Imprimir(){

        System.out.println("A marca e: " + marca);
        System.out.println("A modelo e: " + modelo);
        System.out.println("A ano e: " + ano);
    }

}
