package exercicioVetores;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class exercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("*-- Dizer os números digitados do vetor --* ");
        System.out.println("Quantos números você vai digitar? ");
        int n = input.nextInt();
        int[] vet = new int[n];
        
        //instancia os elementos digitados
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um número: ");
            vet[i] = input.nextInt();
        }
        
        //passa pelos elementos e imprimi apenas os negativos
        System.out.println("Números negativos: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }

    }
}
