public class ExceptionHierchy {
    public static int method01(int n1, int n2){
        return n1/n2;
    }
    public static void method02(int n1, int n2, int n3){
        int ans = n1+method01(n2, n3);

    }
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 8;
        int n3 = 0;
        try{
            method02(n1, n2, n3);
        }catch (ArithmeticException e){
            System.out.println("You can't divide any number by zero");
        }
    }
}
