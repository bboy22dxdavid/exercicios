package exercicio;
import java.util.Locale;
import java.util.Scanner;
/*
* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
* e mostre-a expressa apenas em dias.
* */
public class ContadorIdade {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        double idade = scanner.nextInt();

        double dias = 365 * idade + 9;
        double mes = 1236 * idade;
        double anos =  idade;


        System.out.println("Sua idade em Dias " + String.format(Locale.forLanguageTag("pt-BR"), "%,.2f", dias));
        System.out.println("Sua idade em Meses " + String.format(Locale.forLanguageTag("pt-BR"), "%,.2f", mes));
        System.out.println("Sua idade em Anos " + String.format(Locale.forLanguageTag("pt-BR"), "%,.2f", anos));


    }
}
