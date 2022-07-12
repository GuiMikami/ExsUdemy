package exercicioEncapsulamento;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        account account;

        System.out.println("Enter account number: ");
        int number = input.nextInt();

        System.out.println("Enter account holder: ");
        input.nextLine();
        String holder = input.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = input.next().charAt(0);
        
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = input.nextDouble();
            account = new account(number, holder,initialDeposit);
        } else{
            account = new account(number, holder);
        }
            System.out.println();
            System.out.println("Account data: ");
            System.out.println(account);
            
            //Entrada de dados para o deposito
            System.out.println();
            System.out.print("Enter a deposit value: ");
            double depositValue = input.nextDouble();
            account.deposit(depositValue);
            System.out.println("Updated account data: ");
            System.out.println(account);
            
            
            //Entrada de dados para o saque
            System.out.println();
            System.out.println("Enter a withdraw value: ");
            double withdrawValue = input.nextDouble();
            account.withdraw(withdrawValue);
            System.out.println("Updated account data: ");
            System.out.println(account);
    }
}
