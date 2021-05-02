import java.util.Scanner;

public class lab7_2 {
    public static void main(String[] args) {
        int num;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter even number: ");
            num = in.nextInt();
            if ((num % 2) != 0) {
                System.out.println("Out of loop!");
                break;
            } else {
                System.out.println("Your even number is: " + num);
            }
        } while (true);
    }
}
