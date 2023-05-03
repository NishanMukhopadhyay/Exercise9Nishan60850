public class Task2Nishan60850{
    public static void ErrorChecking(int a, int b){
        int result;
        int Ar[] = new int[5];


        try {

            a = 5;
            b = 0;
            result = a / b;
            Ar[10] = 5;


        } catch (ArithmeticException e) {
            System.out.println("You are not able to divide number with 0; "+e);
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bonds"+e);
        } finally {
            System.out.println("the final of your try/catch!");
        }

    }
}
class TesterNishan2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Task2Nishan60850.ErrorChecking(5, 0);
        }
    }
}
