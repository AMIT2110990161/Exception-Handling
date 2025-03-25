import java.util.InputMismatchException;
import java.util.Scanner;

public class VerifyUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        try{
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            res = n1/n2;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException Occurred");
        }catch (InputMismatchException e){
            System.out.println("InputMismatchException Occurred");
        }

        System.out.println("Result of Division is : " + res);
    }
}
