public class Main {
    public static void main(String[] args) {
        int arr[] = {21,141,12,14,5,123,44,5,521,24,1};
        BubbleSort bubble = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();

        quick.quickSort(arr, 0, arr.length - 1);
        quick.print(arr, arr.length);

    }
}