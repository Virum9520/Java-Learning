import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Find the factorial of number = __");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    static int factorial(int num){
        if(num==0 || num==1)
            return 1;
        else
            return num*factorial(num-1);
    }
}
