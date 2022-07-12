package exercicioEncapsulamento;

/**
 *
 * @author GuiMikami
 */
public class account {

    private int number; // não pode ser modificado ao criar a conta (setNumber)
    private String holder; // pode obter ou modificar o nome
    private double balance; //só vai mudar se tiver um depósito ou saque (setBalance)

    public account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    //Criando os construtores com os 3 argumentos
    public account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }
    public String toString(){
        return "Account "
                + number
                + " , Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
    
}
