public class MultipleCatchBlock {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[1] = null;
        try{
//            arr[6] = 5;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("you are useing null");
        }
    }
}
