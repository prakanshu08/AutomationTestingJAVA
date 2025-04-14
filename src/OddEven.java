import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is even or odd

        if (number % 2 == 0)
        {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }
}
