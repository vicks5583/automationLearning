package my_exercise;

public class BankAccountCaller {
	
	public static void main(String args[]){
		BankAccount ba1 = new BankAccount("Robert",300);
		BankAccount ba2 = new BankAccount("James",560);
		BankAccount ba3 = new BankAccount("Jack",765);
		BankAccount ba4 = new BankAccount("Ben",245);
		BankAccount ba5 = new BankAccount("Steve",650);
         
        System.out.println("Account Number for ba1 " +ba1.getAcctNumber());
        System.out.println("Account Number for ba2 " +ba2.getAcctNumber());
        System.out.println("Account Number for ba3 " +ba3.getAcctNumber());
        System.out.println("Account Number for ba4 " +ba4.getAcctNumber());
        System.out.println("Account Number for ba5 " +ba5.getAcctNumber());
    }

}
