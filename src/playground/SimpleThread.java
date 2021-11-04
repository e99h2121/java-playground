package playground;

public class SimpleThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10000L); // 10秒停止する
                System.out.println("スレッドで動いています:" + (i+1) +"回目");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
