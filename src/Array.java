public class Array {
    public static void main(String[] args) {
//1
        float[] arr1 = {1.1f, 1.2f, 2.1f,0.5f};
        float sum = 0;
        for (float element: arr1)
            sum+=element;
        System.out.println(sum);

//2
        //      int[] arr2 = new int[5];
        int[] arr2 = {1,2,3,4,5};
        boolean presence = false;
        for(int i:arr2)
            presence = i==3;
        System.out.println("3 is present = "+presence);

//3
        int[] marks = {10,25,20,22};
        float avg = 0;
        for(int i:marks)
            avg += i;
        avg = avg/marks.length;
        System.out.println(avg);

//4
        int[][] a = {{1,2,3},{1,2,3}};
        int[][] b = {{3,2,1},{3,2,1}};
        matrix_sum(a,b);

//5
        int n = Math.floorDiv(arr2.length,2);
        int l = arr2.length;
        for(int i=0;i<=n;i++) {
            int temp = arr2[i];
            arr2[i] = arr2[l-i-1];
            arr2[l-i-1] = temp;
        }
        for(int i:arr2)
            System.out.println(i);


//6
        int max = arr2[0];
        for(int i:arr2)
            if(i>max)
                max=i;
        System.out.println(max);

//7
        float min = arr1[0];
        for(float i:arr1)
            if(i<min)
                min=i;
        System.out.println(min);

//8
        int[] unsorted = {6,77,14,8,25,95};
        int[] sorted = {1,2,3,4,5,25,95};

        System.out.println(sorted(unsorted));
        System.out.println(sorted(sorted));
    }


    public static void matrix_sum(int[][] a, int[][] b){
        int[][] sol = new int[a.length][a[0].length];
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length; j++) {
                sol[i][j] = a[i][j] + b[i][j];
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static boolean sorted(int[] a){

        for (int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1])
                return false;
        }
        return true;

    }
}
