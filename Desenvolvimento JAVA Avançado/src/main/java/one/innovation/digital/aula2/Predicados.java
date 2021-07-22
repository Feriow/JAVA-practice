package one.innovation.digital.aula2;

import java.util.function.Predicate;

public class Predicados {
   public static void main(String[] args) {
      Predicate<String> estaVazio = valor -> valor.isEmpty();
      System.out.println(estaVazio.test(""));
      System.out.println(estaVazio.test("Valter"));

      Predicate<String> estaVazio2 = String::isEmpty;
      System.out.println(estaVazio2.test(""));
      System.out.println(estaVazio2.test("Valter"));

      Predicate<String> estaVazio3 = valor -> {
         return valor.isEmpty();
      };
      System.out.println(estaVazio3.test(""));
      System.out.println(estaVazio3.test("Valter"));
   }
}
