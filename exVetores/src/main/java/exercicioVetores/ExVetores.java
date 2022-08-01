package exercicioVetores;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class ExVetores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*-- Vetores --*");
        System.out.println("Digite o tamanho do vetor: ");
        int n = input.nextInt();
        int vet[] = new int[n]; // declarando a variável vet e alocando o espaço do vetor.
        
        
         //instancia os elementos do vetores.
        for (int i = 0; i < vet.length; i++) {      
            System.out.println("Digite um número: ");
            vet[i] = input.nextInt();
        }
            //passa por todos os elementos do vetor lendo cada um deles.
        System.out.println("");
        System.out.println("Números digitados: ");
        for (int i = 0; i < vet.length; i++){
            System.out.println(vet[i]);
        }  
    }
}
