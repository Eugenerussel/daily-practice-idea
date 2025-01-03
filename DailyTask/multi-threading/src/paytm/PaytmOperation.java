package paytm;

class PaytmWallet extends Thread{
    double balance;

    public PaytmWallet(double balance) {
        this.balance = balance;
    }

    synchronized void addMoney(double money){
        this.balance=balance+money;
        System.out.println("Adding amount to wallet");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Amount added: "+money);
        System.out.println("Available Balance after money added : "+balance);
        //notify-again resume the waiting thread.
        notify(); //or notifyAll() if we have more than one object

    }
    synchronized void payBill(double amount){
        System.out.println("Availabe balance:"+balance);
        System.out.println("Amount to be paid: "+amount);
        while(amount>balance){
            try {
                System.out.println("Insufficient balance,add money to account");
                wait(200);// this method thread goes to wait ,and after this next
                //thread is started..(addMoney)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

            System.out.println("Bill paid..PAYMENT SUCCESSFULL!");
            System.out.println("Available balance: "+(this.balance-amount));



    }

    public static void main(String[] args) {
        PaytmWallet wallet=new PaytmWallet(50);
        //wallet.payBill(100);
        Thread bal=new Thread(()->wallet.payBill(100));
        Thread add=new Thread(()->wallet.addMoney(500));
        bal.start();//after this goes to wait state,next thread will be started
        add.start();
    }
}
