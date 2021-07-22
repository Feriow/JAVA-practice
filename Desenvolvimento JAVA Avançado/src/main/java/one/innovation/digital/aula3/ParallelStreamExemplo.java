package one.innovation.digital.aula3;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamExemplo {
   public static void main(String[] args) {
     /* long inicio = System.currentTimeMillis();
      IntStream.range(1,100000).forEach(num -> fatorial(num)); //SERIAL
      long fim = System.currentTimeMillis();
      System.out.println("Tempo de execução serial :: " + (fim - inicio));

      inicio = System.currentTimeMillis();
      IntStream.range(1,100000).parallel().forEach(num -> fatorial(num)); //PARALLEL
      fim = System.currentTimeMillis();
      System.out.println("Tempo de execução parallel :: " + (fim - inicio));*/

      List<String> nomes = Arrays.asList("José", "Valter", "da Silva", "Junior");
      nomes.parallelStream().forEach(System.out::println);
   }
   
   public static long fatorial(long num) {
      long fat = 1;

      for (long i = 2; i <= num; i++) {
         fat *= i;
      }
      return fat;
   }
}