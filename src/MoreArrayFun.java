public class MoreArrayFun {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[10];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i + 1;
        }

        //printing elements of array
        for(int ele : arr){
            System.out.println(ele);
        }
    }
}
