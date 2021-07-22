package one.innovation.digital.aula1;

import java.util.function.UnaryOperator;

//Imutabilidade: Significa que uma vez que uma variável recebeu um valor, vai possuir esse valor
//para sempre. Ou quando criamos um objeto ele não pode ser modificado.

public class Imutabilidade {

   public static void main(String[] args) {
      int valor = 20;
      UnaryOperator<Integer> retornarDobro = v -> v*2;
      
      System.out.println(retornarDobro.apply(valor));
      System.out.println(valor);
   }
   
}
