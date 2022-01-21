package Sorting;

public class FindDuplicates {
    public static void main(String[] args) {

    }

    static int findDup(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {

                int correctIn = arr[i] - 1;
                if (arr[i] != arr[correctIn]) {
                    swap(arr, i, correctIn);
                } else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
