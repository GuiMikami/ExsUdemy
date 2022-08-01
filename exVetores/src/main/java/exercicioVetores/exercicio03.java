package exercicioVetores;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */

/*
Programa que lê N números reais e armazene em um vetor. Em seguida
imprimir todos os elementos do vetor e mostrar na tela a soma e a média 
dos elementos do vetor.
*/

public class exercicio03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma, media;
        int n;

        System.out.println("Quantos números irá digitar: ");
        n = input.nextInt();

        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = input.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i];
        }

        media = soma / n;
        System.out.println("Valores = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);
    }

}
