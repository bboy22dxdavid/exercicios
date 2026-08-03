package ExercicioPOO.Models;

public class EncapsulamentoCarro {

    //impede o acesso direto fora da class
    private  String marca;
    private  String modelo;
    private  int  ano;
    private double valor;

    //construtor da class
    public EncapsulamentoCarro(String marca, String modelo, int ano, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    //metodo para ler os Dados
    public void getAll(){
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("marca: " + ano);
        System.out.println("valor: " + valor);
    }


    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // metodo para ler os dados de forma segura
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
