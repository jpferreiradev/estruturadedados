package Exemplos;

public class Revisao {
    public static void main(String[]args){

        String[] nomes = new String[5];

        nomes[0] = "JP";
        nomes[1] = "Paulo";
        nomes[2] = "Santos";
        nomes[3] = "Ferreira";
        nomes[4] = "Jotepauder";


        // Exemplo for normal
        for(int i = 0; i < nomes.length; i++){ //
            System.out.println(nomes[i]);
        }


        System.out.println();
        System.out.println("Exemplo forEach");

        for(String n : nomes){
            System.out.println(n);
        }


    }
}
