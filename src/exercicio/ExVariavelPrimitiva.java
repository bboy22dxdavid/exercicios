package exercicio;

public class ExVariavelPrimitiva {
    static void main() {
        String nome = "David";
        String endereco = "Rua Botocudos, Qd 30, cha 8, casa 45";
        double salario = 3000.00;
        String dataSalario = "01/08/2026";


        String result = ("EU "+ nome+", morando no endereço:" + endereco + "," +
                "confirmo que recebi o salario de R$: "+salario+", na data: "+dataSalario);

        System.out.println(result);
    }
}
