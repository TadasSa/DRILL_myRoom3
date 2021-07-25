import java.util.Scanner;

public class GetInputs {

    public static int getWidth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room width: ");
        return scanner.nextInt();
    }

    public static int getLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room length: ");
        return scanner.nextInt();
    }
}
