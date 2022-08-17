public class OnlineBankImpl {
    public static void main(String[] args) {
        OnlineBank obj = new OnlineBank();
        obj.accountBalance = 5000;
        obj.accountHolderName = "Raj";
        obj.accountStatus = "Active";
        obj.autoGenerateNo();
        System.out.println("Check balance = "+obj.accountBalance);
        float res = obj.depositCash(obj.accountBalance,2000);
        System.out.println("After Deposit cash  = " + res );
        float res2 = obj.transferFunds(res,3000);
        System.out.println("After Transferred amount = " +res2 );

    }
}
