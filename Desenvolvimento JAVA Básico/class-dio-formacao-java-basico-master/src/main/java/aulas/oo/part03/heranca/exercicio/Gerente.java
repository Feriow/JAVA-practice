package aulas.oo.part03.heranca.exercicio;

public class Gerente extends Funcionario {
    public Gerente(String nome, Double salario) {
       super(nome,salario);
    }

    public Double calculaIR() {
        return (this.getSalario() * 0.1);
    }
}
