package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class Exercicio {
    public static void main (String[] args){

        Calendar agora = Calendar.getInstance();
        Calendar limite = Calendar.getInstance();
        limite.add(Calendar.DATE, 10);

        System.out.printf("A data corrente é : %tD\n", agora.getTime());

        System.out.printf("10 dias após o vencimento: %tD\n", limite.getTime());
        System.out.println(agora.DAY_OF_WEEK);

        if(limite.DAY_OF_WEEK == 7) {
            limite.add(Calendar.DATE,1);
        } else if (limite.DAY_OF_WEEK == 6) {
            limite.add(Calendar.DATE,2);
        }


    }
}
