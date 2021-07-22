package aulas.oo.part03.heranca.exercicio;

public class Atendente extends Funcionario{

    public Atendente(String nome, Double salario) {
        this.setNome(nome);
        this.setSalario(salario);
    }

    public Double calculaIR() {
        return (this.getSalario() * 0.01);
    }
}
