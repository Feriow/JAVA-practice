package strings;

public class StringsTestes {

    public static void main(String[] args){

        var nome = "José";
        var sobrenome = "Valter";
        final var nomeCompleto = nome + " " + sobrenome;

        System.out.println(nomeCompleto);

        //System.out.println("A B C".replace(" ", ""));
      /*  char[] letrasArray = "A B C D E F G".replace(" ", "").toCharArray();
        for(char letra : letrasArray){
            System.out.println(letra);
        }*/
        /*
        String[] stringArray = "Aula de java".split(" ");
        for (String palavra : stringArray) {
            System.out.println(palavra);
        }*/

        System.out.println("Aula".concat(" de Java"));

        System.out.println("1234 asda qw".replaceAll("[0-9]","#"));


    }

}
