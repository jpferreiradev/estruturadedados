public class Vetor {
    public static void main(String[] args) {

        double[] temperaturas = new double[365];

        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 31.3;

        System.out.println("O valor da temperatura do dia é 3 é: " + temperaturas[2]);
        System.out.println("O tamanho do Array de temperaturas é: " + temperaturas.length);

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é :" + temperaturas[i]);
        }
        System.out.println("---------------------");
        for (double valor : temperaturas) {
            System.out.println(valor);
        }
    }
}