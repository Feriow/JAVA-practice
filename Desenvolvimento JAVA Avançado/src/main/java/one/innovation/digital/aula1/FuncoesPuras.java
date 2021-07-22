package one.innovation.digital.aula1;

import java.util.function.BiPredicate;

//É chamada de pura a função que quando invocada mais de uma vez produz exatamente o mesmo resultado.

public class FuncoesPuras {

   public static void main (String[] args){
      BiPredicate<Integer, Integer> verificarSeMaior = 
      (parametro, valorComparacao) -> parametro > valorComparacao;

      System.out.println(verificarSeMaior.test(13,12));
      System.out.println(verificarSeMaior.test(13,12));
   }

}
