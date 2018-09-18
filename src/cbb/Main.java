package cbb;

/*
 * 银行存款程序设计
 * 利用多线程
 * 两个储户同时向同一个账户存款
 * 每次100元，每人存3次
 */

public class Main {
    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer();
        Thread t1 = new Thread(customer);
        Thread t2 = new Thread(customer);
        t1.start();
        t2.start();
    }
}
