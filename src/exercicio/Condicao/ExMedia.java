package exercicio.Condicao;
import java.util.Scanner;

/*
Um usuário deseja um algoritmo e o respectivo programa em php onde possa
escolher que tipo de média deseja calcular a partir de 3 notas. Faça um algoritmo e o
respectivo programa que leia as notas, a opção escolhida pelo usuário e calcule a média.
1 -aritmética
2 -ponderada (3,3,4)
* */

public class ExMedia {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira Nota 1: ");
        double note1 = scanner.nextDouble();
        System.out.print("Digite a primeira Nota 2: ");
        double note2 = scanner.nextDouble();
        System.out.print("Digite a primeira Nota 3: ");
        double note3 = scanner.nextDouble();


        System.out.print("Escolha o tipo de media ");
        System.out.print("1 para Aritimetica 2 para  Ponderada ");

        int media = scanner.nextInt();
        switch (media){
            case 1:
                double mediaAritimetica = (note1 + note2 + note3 ) / 3;
                System.out.println("Media Aritimetica: " + mediaAritimetica);
                break;
            case 2:
                double mediaPonderada = ((note1 * 3) + (note2 * 3) + (note3 * 4)) /10;
                System.out.println("Media Ponderada: " + mediaPonderada);
                break;
            default:
                System.out.println("Media Não encontrada! ");
            break;
        }
    }
}
