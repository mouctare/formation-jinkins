import java.util.Arrays;

/**
 * Hello world!
 *
 */
@SuppressWarnings("A false warning for testing")
public class App {
    public static void main(String[] args) {
        Nested instance = new Nested();
        int result = (int) instance.first(args);
        System.out.println("The result is : " + result);
    }

    static class Nested<T> {
        public T first(T[] args) {
            return args[0];
        }
    }

}
