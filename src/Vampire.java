import java.util.Scanner;

public class Vampire {
    public static int two_digit(int a, int b){
        return (a*10)+b;
    }
    public static void main(String[] args) {
        System.out.println("Enter a 4 digit no");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Your digits are");
        int[] digits = new int[4];
        int n = num;
        for(int i=3;i>=0;i--){
            digits[i] = n%10;
            System.out.print(digits[i]+" ");
            n /= 10;
        }
        System.out.println();
        int n11,n12,n21 = 0,n22 = 0,n1,n2,n3,n4;
        for(int i=0;i<4;i++){
            n11=digits[i];
            for(int j=0;j<4;j++)
                if(digits[j]!=n11) {
                    n12 = digits[j];
                    for(int k=0;k<4;k++){
                        if(digits[k]!=n11 && digits[k]!=n12){
                            n21=digits[k];
                        }
                    }
                    for (int a:digits) {
                        if(a!=n11 && a!=n12 && a!=n21)
                            n22=a;
                    }
                    n1 = two_digit(n11,n12);
                    n2 = two_digit(n21,n22);
                    n3 = two_digit(n12,n11);
                    n4 = two_digit(n22,n21);

                    if(n1*n2==num)
                        System.out.println("Solution is "+ n1+" x "+n2);
                    else if (n3*n4==num) {
                        System.out.println(n3 + " x " + n4);
                    }
                }
        }
    }


}
