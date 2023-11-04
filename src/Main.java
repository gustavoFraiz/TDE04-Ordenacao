import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        long seed = 1231315414;
        Random random = new Random(seed);
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(); // storing random integers in an array
        }

        BubbleSort bubble = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Bubble, 2 - Selection, 3 - Merge, 4 - QuickSort");
        int start = scanner.nextInt();
        System.out.println("---------------------");

        switch(start){

            case 1:
                System.out.println("Bubble Sort");
                bubble.sort(arr);
                bubble.print(arr);
                break;
            case 2:
                System.out.println("Selection Sort");
                selection.sort(arr);
                selection.print(arr);
                break;
            case 3:
                System.out.println("Merge Sort");
                merge.mergeSort(arr, arr.length);
                merge.print(arr, arr.length);
                break;
            case 4:
                System.out.println("Quick Sort");
                quick.quickSort(arr, 0, arr.length - 1);
                quick.print(arr, arr.length);
                break;
        }

    }
}