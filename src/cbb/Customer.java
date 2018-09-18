package cbb;

public class Customer implements Runnable{
    private Bank bank = new Bank();
    public void run() {
        for (int i = 0; i < 3; i++) {
            bank.add(100);
        }
    }
}
