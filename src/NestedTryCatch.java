import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter five values of array here : ");
        for(int i=0; i<1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of Divider here : ");
        int divisor = sc.nextInt();

        boolean check = true;
        int res = 0;
        try {
            int num = 0;
            try {
                num = arr[0];
            } catch (ArrayIndexOutOfBoundsException e) {
                check = false;
                System.out.println("Invalid array index!");
            }
            res = num / divisor;
        }catch (ArithmeticException e){
            check = false;
            System.out.println("Cannot divide by zero!");
        }
        if(check)System.out.println("Division result : " + res);
    }
}
