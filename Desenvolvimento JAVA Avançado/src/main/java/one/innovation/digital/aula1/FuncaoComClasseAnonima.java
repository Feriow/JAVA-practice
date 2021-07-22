package one.innovation.digital.aula1;

public class FuncaoComClasseAnonima {
   public static void main(String[] args) {
      Funcao colocarPrefixoSenhor = new Funcao() {
         @Override
         public String gerar(String valor) {return "Sr. " + valor;}
      };

      System.out.println(colocarPrefixoSenhor.gerar("Valter"));
   }
   
}
