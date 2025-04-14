import java.util.Scanner;
public class ifElse {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Input score from user
            System.out.print("Enter student's score: ");
            int score = sc.nextInt();

            // Check the grade
            if (score >= 90) {
                System.out.println("Grade A");
            } else if (score >= 80) {
                System.out.println("Grade B");
            } else if (score >= 70) {
                System.out.println("Grade C");
            } else {
                System.out.println("Fail");
            }
        }
}
