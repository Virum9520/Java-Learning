public class Frequency {
    public static void main(String[] args) {
        int[] Array = {1,2,2,2,4,1,3,4,0};
        frequency(Array,2);
        frequency(Array,4);

    }
    public static void frequency(int[] array, int a){
        int freq = 0;
        for (int item : array) {
            if(item==a)
                freq++;
        }
        System.out.println("Number '"+a+"' occured "+freq+" times in the given array");
    }
}
