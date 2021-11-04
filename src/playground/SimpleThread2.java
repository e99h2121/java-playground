package playground;

public class SimpleThread2 implements Runnable {
    public void run() {

        Thread t = Thread.currentThread(); // このメソッドを動かしているThreadを得る
        long id = t.getId();
        String name = t.getName();
        System.out.println("スレッドの識別子は" + id + "、名前は" + name + "です");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10000L); // 10秒停止する
                System.out.println("スレッド2で動いています:" + (i+1) +"回目");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
