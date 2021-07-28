import javax.imageio.IIOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        NumberGenerator num1 = new NumberGenerator("Thản");
        NumberGenerator num2 = new NumberGenerator("Phương");
            Thread thread1 = new Thread(num1);
            Thread thread2 = new Thread(num2);
            thread1.setPriority(Thread.MAX_PRIORITY);
            thread2.setPriority(Thread.MIN_PRIORITY);
            thread1
                    .start();
            thread2.start();

    }
}
