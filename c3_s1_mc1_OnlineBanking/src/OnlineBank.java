import java.util.Random;

public class OnlineBank {

        String accountHolderName;
        long accountNumber;
        float accountBalance;
        String accountStatus;


        public void autoGenerateNo() {
            Random obj = new Random();
            System.out.println("12 digit account number ");
            System.out.println(obj.nextLong(100000000000L,999999999999L));
        }



        public void checkBalance(float accountBalance) {

            System.out.println("Available balance " + accountBalance);

        }
        public float depositCash(float accountBalance,float depositAmount){
            float availableBalance = 0.0f;

                availableBalance = accountBalance + depositAmount;

            return availableBalance;
        }
        public float  transferFunds(float accountBalance,float transferAmount){

            float availableBalance = 0.0f;
            if(transferAmount < accountBalance){
                availableBalance = accountBalance - transferAmount;
            }
            return  availableBalance;
        }




}
