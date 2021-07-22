package one.innovation.digital.aula3;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Arrays;
import java.util.ArrayList;

public class FutureExemplo {
   private static final ExecutorService pessoasDisponiveis = Executors.newFixedThreadPool(3);

   public static void main(String[] args) {
      Casa casa = new Casa(new Comodo[]{new Quarto()});
      casa.obterAfazeresDaCasa().stream().map(
         atividade -> pessoasDisponiveis.submit(atividade::realizar));
      pessoasDisponiveis.shutdown();
   }
   
}

class Casa {
   private List<Comodo> comodos;

   Casa(Comodo[] comodos) {this.comodos = Arrays.asList(comodos);}

   List<Atividade> obterAfazeresDaCasa() {
      return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                        .reduce(new ArrayList<Atividade>(), (pivo, atividades)-> {
                           pivo.addAll(atividades);
                           return pivo;
                        });
   }
}

interface Atividade  {
   void realizar() throws InterruptedException;
}

abstract class Comodo {
   abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {
   @Override
   List<Atividade> obterAfazeresDoComodo() {
      return Arrays.asList(
         this::arrumarACama,
         this::varrerOQuarto,
         this::arrumarGuardaRoupa
      );
   }

   private void arrumarGuardaRoupa() throws InterruptedException {
      Thread.sleep(3000);
      System.out.println("Arrumar o guarda roupa");}
   private void varrerOQuarto() throws InterruptedException {
      Thread.sleep(5000);
      System.out.println("Varrer o quarto");}
   private void arrumarACama() throws InterruptedException {
      Thread.sleep(1000);
      System.out.println("Arrumar a cama");}

}