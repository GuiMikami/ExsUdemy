package exercicioVetores;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */



/*
Fazer um programa para ler nome, idade e altura de N pessoas. Depois mostrar na tela
a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16
anos e o nome delas caso houver.
*/
public class exercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
            System.out.println("Nome: ");
            nomes[i] = input.next();
            System.out.println("Idade: ");
            idades[i] = input.nextInt();
            System.out.println("Altura: ");
            alturas[i] = input.nextDouble();
        }

        //Percorre os elementos do vetor acumulando os valores e imprimindo a soma
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma = soma + alturas[i];
        }

        //Faz a méda das alturas.
        double mediaAlturas = soma / n;

        System.out.println("");
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        //Faz a contagem de quantas pessoas tem menos de 16 anos
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                cont = cont + 1;
            }
        }

        //Calculando a porcentagem de quantas pessoas tem menos de 16 anos
        double percent = cont * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        
        //Imprimi o nome das pessoas com menos de 16 anos
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
    }
}
