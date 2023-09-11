public class Pattern {
    public static void main(String[] args) {

        //Pattern 1
//        * * * *
//        * * *
//        * *
//        *
        int i;
        int j;

        for(i=4;i>0;i--){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //Pattern 2
//        *
//        * *
//        * * *
//        * * * *

        for(i=0;i<4;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //Pattern 1 (recursion)

        p1(4);
        p2(4);
    }
    public static void p1(int n){
        if(n>0){
            for(int i=0;i<n;i++)
                System.out.print("*");
            System.out.println("");
            p1(n-1);
        }
    }
    public static void p2(int n){
        if(n>0){
            p2(n-1);
            for (int i=0;i<n;i++)
                System.out.print("*");
            System.out.println();
        }
    }
}
