package exercicio.RepeticaoII;

public class GeradorNumero {
    static void main() {
        //Gerar os números de 100 a 1000 que são divididos por 11 apresentem um resto igual a 5.
        int coluna = 0;

        for (int i = 100; i < 1000; i++) {
          if (i % 11 == 5){
              System.out.printf("%-8d", i);
              coluna++;

              // Se atingir 4 colunas, quebra a linha e reseta o contador
              if (coluna == 4) {
                  System.out.println();
                  coluna = 0;
              }
          }
        }

    }
}
