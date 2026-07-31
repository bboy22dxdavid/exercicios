package exercicio.Condicao;
import java.util.Scanner;

/*
Faça um algoritmo e o respectivo programa que leia a data de nascimento de uma
pessoa, calcule e mostre sua idade
1 - idade para votar (16 anos ou mais)
2 - a Carteira de Habilitação (18 anos ou mais).
*/

public class CalculadoraIdade {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        String categoria;

        //estrutura condicional
        if(idade <= 0 ){
            categoria = "Digite uma Idade valida!";
        } else if (idade >= 16 && idade <=17) {
            categoria = "Pode votar";
        } else if(idade >= 18){
            categoria = "Pode Ter Carteira de Habilitação ";
        }else {
            categoria = " Menor de Idade ";
        }

        System.out.println("Sua idade e: " + idade + " Anos" + " e " + categoria);
    }

}
