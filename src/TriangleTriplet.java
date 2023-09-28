import java.util.Arrays;

public class TriangleTriplet {
    //    3. Given an integer array of numbers,
    //    return the number of triplets chosen from the array that
    //    can make triangles if we take them as side lengths of a triangle.
    public static int count_triplets(int[] arr){
        int count =0;
        if(arr.length<3)
            return count;
        Arrays.sort(arr);

        for (int i = arr.length-1; i >=2 ; i--) {
            int left = 0;
            int right = i-1;

            while(left<right){
                if(arr[left] + arr[right] > arr[i] ){
                    count += (right-left);
                    right --;
                }
                else
                    left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array1 = {2,2,3,4};
        int[] array2 = {4,2,3,4};

        System.out.println(count_triplets(array1));
        System.out.println(count_triplets(array2));
    }
}
