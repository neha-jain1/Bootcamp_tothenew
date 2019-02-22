public class Q6 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        try {

            System.out.println(arr[9]); //throws ArrayIndexOutofBoundException

            int a=67/0;                   // throws Arithmetic exception
        } catch (ArithmeticException e) {
            System.out.println("OOPS an exception occurred while performing arithmatic operation");

        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("The accessed index is out of range");
        }
        catch (NegativeArraySizeException e2){
            System.out.println("The entered index is negative");
        }

    }
}
