package digital.innovation.one.operacao;

import digital.innovation.one.operacao.internal.DivHelper;
import digital.innovation.one.operacao.internal.MultHelper;
import digital.innovation.one.operacao.internal.SubHelper;
import digital.innovation.one.operacao.internal.SumHelper;

public class Calculadora {

   private DivHelper divhelper;
   private MultHelper multhelper;
   private SubHelper subhelper;
   private SumHelper sumhelper;

   public Calculadora() {
      divhelper = new DivHelper();
      multhelper = new MultHelper();
      subhelper = new SubHelper();
      sumhelper = new SumHelper();
   }

   public int sum(int a, int b) {
      return sumhelper.execute(a, b);
   }

   public int sub(int a, int b) {
      return subhelper.execute(a, b);
   }

   public int mult(int a, int b){
      return multhelper.execute(a, b);
   }

   public int div(int a, int b){
      return divhelper.execute(a, b);
   }
}
