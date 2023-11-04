public class Main {
    public static void main(String[] args) {
        int arr[] = {21,141,12,14,5,123,44,5,521,24,1};
//        BubbleSort sort = new BubbleSort();
//        SelectionSort sort1 = new SelectionSort();
//
//        int array[] = sort.sort(arr);
//        sort.print(array);

        MergeSort sort = new MergeSort();

        sort.mergeSort(arr, arr.length);
        sort.print(arr, arr.length);

    }
}