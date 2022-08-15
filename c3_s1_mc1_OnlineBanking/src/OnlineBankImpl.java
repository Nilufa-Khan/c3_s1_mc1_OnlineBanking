public class OnlineBankImpl {
    public static void main(String[] args) {
        OnlineBank obj = new OnlineBank();
        obj.accountBalance = 5000;
        obj.accountHolderName = "Raj";
        obj.accountStatus = "Active";
        obj.autoGenerateNo();
        System.out.println("Check balance = "+obj.accountBalance);
        System.out.println("Withdrawl cash = "+obj.withdrawCash(obj.accountBalance,500));
        System.out.println("Deposit cash  = " + obj.depositCash(obj.accountBalance,2000));
        System.out.println("Transferred amount = " + obj.transferFunds(obj.accountBalance,3000));

    }
}
