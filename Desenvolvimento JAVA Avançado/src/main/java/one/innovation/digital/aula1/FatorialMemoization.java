package one.innovation.digital.aula1;

import java.util.HashMap;
import java.util.Map;

public class FatorialMemoization {

   static Map<Integer,Integer> MAPA_FATORIAL = new HashMap<>();

   public static void main(String[] args){
      long I = System.nanoTime();
      System.out.println(fatorialComMemorization(10));
      long F = System.nanoTime();
      System.out.println("FATORIAL 1 " + (F-I));
      
      I = System.nanoTime();
      System.out.println(fatorialComMemorization(15));
      F = System.nanoTime();
      System.out.println("FATORIAL 1 " + (F-I));      
   }

   public static Integer fatorialComMemorization(Integer value) {
      if (value == 0 ) {
         return 1;
      } else {
         if(MAPA_FATORIAL.containsKey(value)){
            return MAPA_FATORIAL.get(value);
         } else {
            Integer resultado = value * fatorialComMemorization(value-1);
            MAPA_FATORIAL.put(value,resultado);
            return resultado;
         }
      }
   }
   
}
