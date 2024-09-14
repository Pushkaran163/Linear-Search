// 1. Using Linear Search Method:

public class LinearSearch{

    private static int check(int[] arr, int value){
        for (int i=0; i<arr.length; i++){
            if(arr[i] == value){
                // System.out.println("Value found at index: " + i);
                return i;
            }
        }
        // System.out.println("Value not found in the array");
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {24, 56, 47, 78, 93, 67};
        int value = 78;
        int ans = check(arr, value);

        if(ans == -1){
            System.out.println("Value not found in the array");
    }else{
        System.out.println("Value found at index: " + ans);
    }
}
}