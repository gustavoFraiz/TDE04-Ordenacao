public class SelectionSort {

    int minimo, aux, length, countI, countT;

    public SelectionSort(){
        this.minimo = 0;
        this.aux = 0;
        this.length = 0;
        this.countI = 0;
        this.countT = 0;
    }

    public int[] sort(int[] arr){
        length = arr.length;

        for(int i = 0; i < length-1; i++){

            minimo = i;

            for(int j = i + 1; j < length; j++){
                if(arr[j] < arr[minimo]){minimo = j;}
            }
            aux = arr[minimo];
            arr[minimo] = arr[i];
            arr[i] = aux;
            countT = countT + 1;
        }
    return arr;
    }

    public void print(int[] arr){
        this.length = arr.length;
        for(int k = 0; k < length; k++){
            System.out.print(arr[k] + ", ");
        }
        System.out.println();
        System.out.println("Numero de trocas: " + countT);
    }
}
