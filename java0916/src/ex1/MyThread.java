package ex1;

/**
 * @author KOSTA Document : MyThread Created on : 2014. 9. 16, ¿ÀÀü 11:34:38
 */
public class MyThread {

    public MyThread() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
    }
}
