import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /////TASK 1
        Scanner scanner=new Scanner(System.in);

        int a= 0;
        int b= 0;

        while (true){
            try {
                System.out.println("enter first number:");
                a= scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Error: Please enter an integer!");
                scanner.next();
            }
        } while (true){
            try {
                System.out.println("enter second number:");
                b= scanner.nextInt();

                int c=a/b;
                System.out.println("division result:" + c);

                break;
            }catch (InputMismatchException e){
                System.out.println("Error: Please enter an integer!");
                scanner.next();
            }catch (ArithmeticException e){
                System.out.println("Error: Cannot divide by zero! Enter the second number again.");
            }
        }
        scanner.close();
    }
}