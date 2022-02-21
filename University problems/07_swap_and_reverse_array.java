import java.util.Arrays;

class Arrayops{
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int arr[]){
        int start = 0, end = arr.length-1;

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 4, 7, 9, 5};
        // swap(a, 0, 2);
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}