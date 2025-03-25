class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String argue){
        super(argue);
    }
}

public class BankTransactionSystem {
    private double totalMoney = 100;

    public void withdraw(double amount) throws  InsufficientBalanceException {
        if(amount > totalMoney){
            throw new InsufficientBalanceException("InsufficientBalanceException");
        }else if(amount < 0){
            throw new IllegalArgumentException("Balance is negative");
        }
    }
    public static void main(String[] args) {
        BankTransactionSystem bts = new BankTransactionSystem();
        try{
            bts.withdraw(-500);
        }catch (InsufficientBalanceException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
