import ExercicioPOO.Models.EncapsulamentoCarro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instanciando a class carro
        //Carro carro = new Carro("Wv", "Gol", 2026);
        EncapsulamentoCarro encapsulamentoCarro = new EncapsulamentoCarro("","", 0, 0);

        //Implementando a class Scanner para receber dados no teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Digite a Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a ano: ");
        int ano = scanner.nextInt();
        System.out.print("Digite o valor : ");
        double valor = scanner.nextDouble();


        //carro.Imprimir();

        // setando os novos valores recebidos pelo input no OBJ_Carro
        encapsulamentoCarro.setMarca(marca);
        encapsulamentoCarro.setModelo(modelo);
        encapsulamentoCarro.setAno(ano);
        encapsulamentoCarro.setValor(valor);



        System.out.println("=====================");
        //Printando Os Dados da class OBJ_Carro
       encapsulamentoCarro.getAll();
    }
}

