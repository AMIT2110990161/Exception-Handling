import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}

public class CustomExeption {

    public static void invalidAge(int num) throws InvalidAgeException{
        if(num < 18){
            throw new InvalidAgeException("Your age is no valid");
        }else{
            System.out.println("Your age is valid");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try{
            invalidAge(num);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
