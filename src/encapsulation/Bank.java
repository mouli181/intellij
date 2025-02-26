package encapsulation;

public class Bank {
    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBalance(1000);
        System.out.println(b.getBalance());
    }
}
