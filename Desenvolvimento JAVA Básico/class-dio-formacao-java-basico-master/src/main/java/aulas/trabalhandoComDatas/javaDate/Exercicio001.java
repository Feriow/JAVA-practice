package aulas.trabalhandoComDatas.javaDate;

import java.sql.Time;
import java.util.Date;

public class Exercicio001 {


    public static void main(String[] args) {

        Exercicio001 e = new Exercicio001();

      //  e.checaLong(560874629000L);

        Long myEpoch = 560885429000L;

        System.out.println(myEpoch);

        Date novaData = new Date(myEpoch);
        System.out.println(novaData);

        //comparar com 15 maio 2010
        Long maio152010 = 1273944629000L;
        Date dataComp = new Date(maio152010);
        System.out.println(dataComp);

        System.out.println("Nasci antes de 15 de maio de 2010? "+novaData.before(dataComp));
        System.out.println("Nasci depois de 15 de maio de 2010? "+novaData.after(dataComp));

    }


    /**
     * Exercicio 1
     *
     * Você tem um epoch (formato long) converta no formato Date
     *
     * Epoch 1563385317992
     *
     * Ponto de atenção: como você está manipulando um numero do tipo long, dependendo da maneira que você estiver
     *                   manipulando essa informação, você precisa colocar a letra l no final do numero
     *
     *
     *
     * @param epoch
     * @return
     */
    public Date checaLong(long epoch) {

        Date date = new Date(1563385317992L);

        System.out.println(date);


        return null;
    }

    /**
     *
     * @return
     */
    public long dateToLong() {



        return 0L;
    }

}
