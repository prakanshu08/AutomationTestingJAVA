import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the User's age: ");
        int age = sc.nextInt();

        if (age<18){
            System.out.println("User is MINOR ");
        } else if (age <= 59) {
            System.out.println("User is ADULT ");
        }else{
            System.out.println("User is SENIOR Citizen ");
        }

    }
}
