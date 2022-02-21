class MinMax{

    //USING FOR LOOP    
    // static int maxNum(int arr[]){
    //     int max = arr[0];

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }

    //     return max;
    // }

    // USING FOR-EACH
    static int maxNum(int arr[]){
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // USING FOR LOOP
    // static int minNum(int arr[]){
    //     int min = arr[0];
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] < min) {
    //             min = arr[i];
    //         }
    //     }
    //     return min;
    // }

    // USING FOR-EACH
    static int minNum(int arr[]){
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {7, 10, 25 , 80, 105, -5, -12};
        
        int largest = maxNum(arr);
        int smallest = minNum(arr);

        System.out.println(largest);
        System.out.println(smallest);
        
    }
}

/*
FOR MAXIMUM [7, 5, 10]
max = 7

7 > 5 -> max = 7

10 > 7 -> max = 10

*/