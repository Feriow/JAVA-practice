package one.innovation.digital.aula2;

import java.util.function.Supplier;

public class Suppliers {
   public static void main(String[] args) {

      Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
      Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;

      System.out.println(instanciaPessoa.get());
      System.out.println(instanciaPessoa2.get());
   }
   
}

class Pessoa {
   private String nome;
   private Integer idade;

   public Pessoa() {
      nome = "Valter";
      idade = 33;
   }

   @Override
   public String toString() {
      return String.format("Nome: %s, idade: %d",nome,idade);
   }
}
