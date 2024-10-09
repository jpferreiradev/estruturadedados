package Exemplos;

public class ExemploParseInt {
    public static void main(String[] args) {

        String minhaString = "4152";
        String minhaStringError = "Isso não é um número";
        int myInt = Integer.parseInt(minhaString);
        int myIntError = Integer.parseInt(minhaStringError);


        System.out.println(myInt);
        System.out.println(myIntError);
    }
}

/*
//utilizado para transformar uma String para um int
String valor1 = "10";
int valorInt1 = Integer.parseInt(valor1);

//utilizado para transforma um (wrapper) Integer em um primitivo (int)
Integer valor2 = new  Integer(10);
int valorInt2 = valor2.intValue();

//utilizado para transformar um int (primitivo) para um Integer (wrapper)
int valor3 = 1111111111;
Integer valorInt3 = Integer.valueOf(valor3);
 */