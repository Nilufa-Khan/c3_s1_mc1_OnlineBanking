import java.util.Random;

public class OnlineBanking {
    String accountHolderName;

    int accountBalance;
    String accountStatus;


        public void autoGenerateNo() {
            Random obj = new Random();
            System.out.println("12 digit account number ");
            System.out.println(obj.nextLong(100000000000l,999999999999l));
        }

        public float  withdrawCash(int accountBalance,int withdrawlAmount){
            float availableBalance = 0.0f;
            if(withdrawlAmount > accountBalance) {
              availableBalance = accountBalance - withdrawlAmount;

            }
            return availableBalance;
    }
    public void checkBalance(int accountBalance) {

            System.out.println("Available balance " + accountBalance);

    }
    public float depositCash(int accountBalance,int depositAmount){
            float availableBalance = 0.0f;
            if(depositAmount > accountBalance){
                availableBalance = accountBalance -depositAmount;
            }
            return availableBalance;
    }
    public float  transferFunds(int accountBalance,int transferAmount){

        Random obj = new Random();
        System.out.println("12 digit transfer account number ");
        System.out.println(obj.nextLong(100000000000l,999999999999l));
        float availableBalance = 0.0f;
        if(transferAmount > accountBalance){
            availableBalance = accountBalance - transferAmount;
        }
        return  availableBalance;
    }



}
