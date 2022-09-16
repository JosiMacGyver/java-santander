public class Variaveis {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String nome = "Joseana";
        int a;
        int b = 2;
        a = 3;
        int soma = a+b;
        int subtracao = a-b;
        int multiplicacao = a*b;
        //cast para transformar a e b nessa operação como tipo float
        float divisao = (float) a/b;

        System.out.println("Soma: " +soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Olá, " + nome);
    }
}

