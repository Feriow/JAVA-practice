package one.innovation.digital.aula2;

import java.util.function.Function;

public class Funcoes {
   public static void main(String[] args) {
      Function<String,String> inverterNome = texto -> new StringBuilder(texto).reverse().toString();
      System.out.println(inverterNome.apply("jose valter da silva junior"));

                                                            //Método de referência
      Function<String, Integer> converterStringParaInteiro = Integer::valueOf;
      System.out.println(converterStringParaInteiro.apply("20"));

      Function<String, Integer> converterStringParaInteiroDobrar = str -> Integer.valueOf(str) * 2;
      System.out.println(converterStringParaInteiroDobrar.apply("20"));
   }
   
}
