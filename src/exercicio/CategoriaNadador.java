package exercicio;
import java.util.Scanner;

/*Elabore um algoritmo e o respectivo programa que dada a idade de um nadador
classifique-o em uma das seguintes categorias:
infantil A = 5 - 7 anos
infantil B = 8-10 anos
juvenil A = 11-13 anos
juvenil B = 14-17 anos
adulto = maiores de 18 anos*/

public class CategoriaNadador {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        String categoria;

        //estrutura condicional
        if(idade <= 5 && idade ==7){
            categoria = "infantil A";
        } else if (idade >= 8 && idade <=10) {
            categoria = "infantil B";
        } else if (idade >= 11 && idade <=13)  {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <=17)  {
            categoria = "Juvenil B";
        } else {
            categoria = "Adulto ";
        }

        System.out.println("Sua idade e: " + idade + " Anos" + " e sua Categoria e: " + categoria);
    }

}
