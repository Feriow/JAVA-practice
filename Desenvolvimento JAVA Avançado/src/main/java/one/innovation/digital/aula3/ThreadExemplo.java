package one.innovation.digital.aula3;

import java.lang.InterruptedException;


public class ThreadExemplo {
   public static void main(String[] args){

      GeradorPDF iniciarGeradorPdf = new GeradorPDF();
      BarraDeCarregamento iniciarBarraCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);

      iniciarGeradorPdf.start();
      iniciarBarraCarregamento.start();

      /*
      Thread thread2 = new Thread(new BarraDeCarregamento2());
      Thread thread3 = new Thread(new BarraDeCarregamento3());

      thread2.start();
      thread3.start();
      System.out.println("Nome da thread : " + thread2.getName());
      System.out.println("Nome da thread : " + thread3.getName());
      */
   }
}

class GeradorPDF extends Thread {
   @Override
   public void run() {
      try {
         System.out.println("Iniciar geração de PDF");
         Thread.sleep(5000);
      } catch(InterruptedException e) {
         e.printStackTrace();
      }
      System.out.println("PDF gerado");
   }
}

class BarraDeCarregamento extends Thread {
   private Thread iniciarGeradorPdf;

   public BarraDeCarregamento(Thread iniciarGeradorPdf){
      this.iniciarGeradorPdf = iniciarGeradorPdf;
   }

   @Override
   public void run() {
      while(true){
         try {
            Thread.sleep(500);
            if(!iniciarGeradorPdf.isAlive()) break;
            System.out.println("Loading...");
         } catch(InterruptedException e) {
            e.printStackTrace();
         }
      }      
   }
}

class BarraDeCarregamento2 implements Runnable {
   @Override
   public void run() {
      try {
         Thread.sleep(3000);
         System.out.println("Rodei BarraDeCarregamento2");
      } catch(InterruptedException e) {
         e.printStackTrace();
      }
   }
}

class BarraDeCarregamento3 implements Runnable {
   @Override
   public void run() {
      try {
         Thread.sleep(1000);
         System.out.println("Rodei BarraDeCarregamento3");
      } catch(InterruptedException e) {
         e.printStackTrace();
      }
   }
}