import java.util.Scanner;

/**
 * @author Vlad Sivko
 * @since 12.04.2019
 */
public class ClassForHeaderTest {
        public static void main(String[] args) {
            Main MainObject = new Main();
            MainObject.HWSeparateMethod();
            Scanner Scan = new Scanner(System.in);
            String read = Scan.next();
            System.out.printf("Your text is %s", read);
        }
}
