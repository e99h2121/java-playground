package playground;
import java.io.File;
public class SimpleThreadReceiver implements Runnable {
    public void run() {

        Thread t = Thread.currentThread(); // このメソッドを動かしているThreadを得る
        long id = t.getId();
        String name = t.getName();
        System.out.println("スレッドの識別子は" + id + "、名前は" + name + "です");
        int i = 0;
        File file = new File("C:\\dummy\\test.txt");
        boolean stop = false;

        while (!stop) {
            try {
                i++;
                Thread.sleep(10000L); // 10秒停止する
                System.out.println("スレッドReceiverで動いています:" + (i) +"回目");
                if (file.exists()) {
                    stop = true;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
