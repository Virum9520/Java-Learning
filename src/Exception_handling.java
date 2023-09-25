import java.util.Scanner;

public class Exception_handling {

//    static int divide(int a, int b){
//        return a/b;
//    }
//
//    public static void main(String[] args) {
//
//        try {
//            int c = divide(6,0);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Hehe");
//        }
//    }

    static class calc{
        int add(int a, int b){
            return a+b;
        }
        int subtract(int a, int b){
            return a-b;
        }
        int divide(int a, int b){
            return a/b;
        }
        int mult(int a, int b){
            return a*b;
        }
    }
    public static class InvalidInputException extends Exception{
        public InvalidInputException(){
            System.out.println("Invalid input");
        }
    }
    public static void validate(int op) throws InvalidInputException{
        if(op!=1 && op!=2 && op!=3 && op!=4){
            throw new InvalidInputException();
        }
        else {
            System.out.println("Valid Input");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();

        System.out.println("Enter operation number\n1.Add\n2.Subtract\n3.Divide\n4.Multiply");
        int op = sc.nextInt();
        try {
            validate(op);
        } catch (InvalidInputException e) {
            return;
        }
        if(op==3 && b==0){
            throw new ArithmeticException("Cant Divide by 0");
        }
    }

}
