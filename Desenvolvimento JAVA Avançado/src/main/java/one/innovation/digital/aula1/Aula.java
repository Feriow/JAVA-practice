package one.innovation.digital.aula1;

import java.util.function.UnaryOperator;

public class Aula {

   public static void main(String[] args) {
      //Paradigma imperativo:
      int valor = 10;
      int resultado = valor * 3;
      System.out.println("O resultado é: "+ resultado);

      //Paradigma funcional:
      UnaryOperator<Integer> calcularValorVezesTrinta = valor2 -> valor2 * 3;
      int valor2 = 20;
      System.out.println("O resultado é:: "+ calcularValorVezesTrinta.apply(valor2) );
   }
   
}
