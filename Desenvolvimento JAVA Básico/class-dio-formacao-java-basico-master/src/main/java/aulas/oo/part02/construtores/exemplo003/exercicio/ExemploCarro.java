package aulas.oo.part02.construtores.exemplo003.exercicio;

public class ExemploCarro {
    public static void main(String[] args){
        Carro carro1 = new Carro("Ford", "Ka",2020);
        Carro carro2 = new Carro("Fiat", "Elba",1997);

        System.out.println(
                carro1.getMarca()+ "/" + carro1.getModelo() + "/" + carro1.getAno()
        );

        System.out.println(
                carro2.getMarca()+ "/" + carro2.getModelo() + "/" + carro2.getAno()
        );

        carro1.setVariante("Azul");
        carro2.setVariante("Preto");

        System.out.println(carro1.getVariante());
        System.out.println(carro2.getVariante());
    }
}
