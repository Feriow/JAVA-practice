package one.innovation.digital.aula1;

public class FuncaoComLambda {
   public static void main(String[] args) {
      Funcao colocarPrefixoSenhor = valor -> "Sr. " + valor;

      System.out.println(colocarPrefixoSenhor.gerar("Valter"));
   }
}