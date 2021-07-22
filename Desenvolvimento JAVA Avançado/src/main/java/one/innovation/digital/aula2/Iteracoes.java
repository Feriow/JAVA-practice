package one.innovation.digital.aula2;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Iteracoes {
   public static void main(String[] args) {
      String[] nomes = {"Joao", "Valter", "Amanda","Estudante", "Lisboa", "Portugal"};
      Integer[] numeros = {1,2,3,4,5};
      imprimirNomesFiltrados(nomes);
      imprimirTodosNomes(nomes);
      imprimirODobro(numeros);

      List<String> profissoes = new ArrayList<>();
      profissoes.add("Desenvolvedor");
      profissoes.add("Testador");
      profissoes.add("Gerente de projeto");
      profissoes.add("Gerente de qualidade");

      profissoes.stream().filter(profissao -> profissao.startsWith("Gerente"))
                        .forEach(System.out::println);
   }

   public static void imprimirNomesFiltrados(String... nomes) {
      String nomesFor = "";
      for(int i = 0; i < nomes.length; i++) {
         if(nomes[i].equals("Valter") || nomes[i].equals("Estudante")){
            nomesFor += " " + nomes[i];
         }
      }

      System.out.println("Nomes do for: " + nomesFor);

      String nomesStream = Stream.of(nomes)
                           .filter(nome -> nome.equals("Amanda") || nome.equals("Lisboa"))
                           .collect(Collectors.joining(" * "));

      System.out.println("Nomes do stream: " + nomesStream);
   }

   public static void imprimirTodosNomes(String... nomes) {
/*      for (String nome : nomes) {
         System.out.println(nome);
      }*/

      Stream.of(nomes).forEach(System.out::println);
   }

   public static void imprimirODobro(Integer[] numeros) {
   /*   for (Integer numero : numeros) {
         System.out.println(numero*2);
      }*/

      Stream.of(numeros).forEach(numero -> System.out.println("Sem map: " + numero*2));

      Stream.of(numeros).map(numero -> ("Com map: " + numero * 2))
                        .forEach(System.out::println);
   }
}

