package one.innovation.digital.aula2;

import java.util.function.Consumer;

public class Consumidores {
   public static void main(String[] args) {


   //Forma normal de escrever a lambda:
      Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);

   //Forma resumida onde a função já entende que recebeu um paramêtro e vai imprimi-lo
      Consumer<String> imprimirUmaFrase2 = System.out::println; 

      imprimirUmaFrase.accept("Hello World");
      imprimirUmaFrase2.accept("Hello World");
   }
}
