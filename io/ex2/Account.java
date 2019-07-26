package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/* Account */
public class Account {
    private int balance;
    public synchronized void withdraw(int money){
        if(balance >= money){
            try {
                Thread.sleep(1000);
                balance -= money;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    public synchronized int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("°Ë»ç :"+balance);
    }
    
}
