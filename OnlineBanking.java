import java.util.Random;
import java.util.Scanner;
public class OnlineBanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random obj = new Random();
        System.out.println("12 digit account number ");
        System.out.println(obj.nextLong(100000000000l,999999999999l));
        System.out.println("Enter account holder name");
        String accountHolderName = sc.nextLine();
        System.out.println("Account balance");
        int accountBalance = sc.nextInt();
        System.out.println("Withdrawl amount");
        int cashWithdraw = sc.nextInt();
        System.out.println("Deposit amount");
        int depositAmount = sc.nextInt();
        System.out.println("transferred amount");
        int transferredAmount = sc.nextInt();



        int after_withDrawl = accountBalance - cashWithdraw;
        int dep = after_withDrawl+ depositAmount;
        int trans = dep - transferredAmount;
        int avb = accountBalance - cashWithdraw;

            OnlineBanking ob = new OnlineBanking();
            ob.withdrawCash(cashWithdraw);

            ob.depositCash(dep);
            ob.transferFunds(trans);
            ob.savingsAccount(transferredAmount,depositAmount);
            ob.checkBalance(trans);

    }
    public void withdrawCash(int balance){
        System.out.println("Withdrawl amount "+balance);

    }
    public void checkBalance(int available_balance) {
        if (available_balance < 100) {
            System.out.println("Account status - frozen");
        } else {
            System.out.println("Available balance " + available_balance);
        }
    }
    public void depositCash(int cash){


        System.out.println("After cash deposit "+ cash);
    }
    public void  transferFunds(int cash){

        System.out.println("After fund transfer "+ cash);
    }
    public void savingsAccount(int debit_Cash, int credit_Cash){
        System.out.println("Debited cash "+debit_Cash);
        System.out.println("Credited cash "+credit_Cash);

    }


}