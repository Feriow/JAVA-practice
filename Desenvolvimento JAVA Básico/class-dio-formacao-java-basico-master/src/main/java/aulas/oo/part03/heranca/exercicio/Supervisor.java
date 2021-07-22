package aulas.oo.part03.heranca.exercicio;

public class Supervisor extends Funcionario{
    public Supervisor(String nome, Double salario) {
        this.setNome(nome);
        this.setSalario(salario);
    }

    public Double calculaIR() {
        return (this.getSalario() * 0.05);
    }
}
