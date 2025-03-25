import java.util.Scanner;

public class FinallyBlockUseCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        try{
            int res = n1/n2;
        }catch (ArithmeticException e){
            System.out.println("Pls divide with valid number");
        }finally {
            System.out.println("Operation is Completed");
        }
    }
}
