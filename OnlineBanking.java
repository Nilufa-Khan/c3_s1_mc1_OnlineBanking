import java.util.Random;

public class OnlineBanking {
    String accountHolderName;
    long accountNumber;
    int accountBalance;
    String accountStatus;


        public void autoGenerateNo() {
            Random obj = new Random();
            System.out.println("12 digit account number ");
            System.out.println(obj.nextLong(100000000000L,999999999999L));
        }

        public float  withdrawCash(int accountBalance,int withdrawlAmount){
            float availableBalance = 0.0f;
            if(withdrawlAmount < accountBalance) {
              availableBalance = accountBalance - withdrawlAmount;

            }
            return availableBalance;
    }
    public void checkBalance(int accountBalance) {

            System.out.println("Available balance " + accountBalance);

    }
    public float depositCash(int accountBalance,int depositAmount){
            float availableBalance = 0.0f;
           
                availableBalance = accountBalance + depositAmount;
          
            return availableBalance;
    }
    public float  transferFunds(int accountBalance,int transferAmount){

        float availableBalance = 0.0f;
        if(transferAmount < accountBalance){
            availableBalance = accountBalance - transferAmount;
        }
        return  availableBalance;
    }



}
