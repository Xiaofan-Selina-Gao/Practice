import static java.lang.Thread.sleep;

public class Summer extends Thread{

     static volatile int sum;

    public Summer(int sum) {
        this.sum = sum;
    }

    public synchronized void up() {
        while (sum <= 0) {
            sum++;
            System.out.println(sum);
        }

        this.notify(); // notify waiting threads that sum has changed
    }

    public synchronized void down() {
        while (sum <= 0) {
            try {
                this.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sum--;
        System.out.println(sum);
    }
    @Override
    public void run(){
        System.out.println("MyThread running");
        up();
        down();
    }
    public static void main(String[] args){
        Summer t = new Summer(-3);
        Thread thread1 = new Thread(t);
//        Thread thread1 = new Thread(new Runnable(){
//
//            @Override
//            public void run() {
//                while(sum<10){
//                    t.down();
//                }
//
//            }
//        }, "thread1");
//        Thread thread2 = new Thread(new Runnable(){
//
//            @Override
//            public void run() {
//                while(sum <10){
//                    t.up();
//                }
//            }
//        }, "thread2");

        thread1.start();
       //thread2.start();

    }

}
