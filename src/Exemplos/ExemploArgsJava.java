package Exemplos;

public class ExemploArgsJava {
    public static void main(String[] args) {


        if(args.length > 0){
            System.out.println("Argumentos passada: ");
            for(int i = 0; i < args.length;i++){
                System.out.println("Argumento " + i + args[i]);
            }
        } else{
            System.out.println("Nenhum argumento passado! ");
        }
    }
}
