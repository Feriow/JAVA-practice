package aulas.oo.part01.paradigma.exemplo001.Exercicio;

public class Carro {
    private Integer qtdPessoas = 1;

    public Integer getQtdPessoas() {return qtdPessoas;}

    public String addPessoa() {
        this.qtdPessoas+=1;
        if(qtdPessoas>1){
            return "Uma pessoa entrou no carro. Agora somos: " + qtdPessoas + " pessoas";
        } else {
            return "Eu entrei no carro. Estou sozinho";
        }
    }

    public String removePessoa() {
        if(qtdPessoas>0){
            this.qtdPessoas-=1;
        } else {
            return "O carro já está vazio";
        }
        if(qtdPessoas>1){
            return "Uma pessoa saiu do carro. Agora somos: " + qtdPessoas + " pessoas";
        } else if (qtdPessoas==1) {
            return "Uma pessoa saiu do carro. Eu estou sozinho";
        } else {
            return "Eu sai do carro. O carro está vazio";
        }
    }
}
