import java.util.Arrays;

public class Vetores {

    public static void main(String[] args){
        int[] numeros = new int[5];

        for (int i = 0; i< numeros.length; i++){
            numeros[i] = i+1;
            System.out.println(numeros[i]);
        }

        String[] letras = {"A", "B", "C", "D", "F", "G", "J"};

        for (int j=0; j<letras.length; j++){
            System.out.println(letras[j]);
        }

        System.out.println(Arrays.toString(letras));

        int[] aleatorios = {9, 10, 12, 25, 2};
        int maior = aleatorios[0];
        int menor = aleatorios[0];
        int media = 0;

        for (int i=0; i < aleatorios.length; i++) {
            if(aleatorios[i] > maior){
                maior = aleatorios[i];
            }
            if(aleatorios[i]< menor){
                menor = aleatorios[i];
            }
            media += aleatorios[i];
        }

        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        System.out.println("Média = " + media/aleatorios.length);
    }

}
