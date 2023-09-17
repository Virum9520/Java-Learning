import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }


        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr1[i];
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sum-arr1[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}
