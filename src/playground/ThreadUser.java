package playground;

public class ThreadUser {

    public static void main(String[] args) {
        SimpleThread t = new SimpleThread();
        t.start();

        SimpleThread2 t2 = new SimpleThread2();
        Thread t2c = new Thread(t2); 
        t2c.start();

        System.out.println("joinを始めます");

        try {
            t.join(); // スレッドでの処理が終わるまで、ここでブロックされる
            t2c.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("joinが終わりました");
    }
}
