package aulas.oo.part03.heranca.exercicio;

public class ExemploFuncionarios {
    public static void main (String[] args){
        Gerente gerente = new Gerente("Valter", 20000.00);
        System.out.println(gerente.getNome()+" deve pagar de IR: R$"+gerente.calculaIR());

        Supervisor supervisor = new Supervisor("Mariana", 5000.00);
        Atendente atendente = new Atendente("Paulo", 1500.00);
        System.out.println(supervisor.getNome()+" deve pagar de IR: R$"+supervisor.calculaIR());
        System.out.println(atendente.getNome()+" deve pagar de IR: R$"+atendente.calculaIR());

        System.out.println(atendente instanceof Atendente);
    }
}
