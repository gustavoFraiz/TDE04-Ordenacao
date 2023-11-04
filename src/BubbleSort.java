public class BubbleSort {
    int i, j, aux, countT, countI, length;

    public BubbleSort(){
        this.i = 0;
        this.j = 0;
        this.aux = 0;
        this.countT = 0;
        this.countI = 0;
        this.length = 0;

    }

    public int[] sort(int[] array){

        this.length = array.length - 1;

        for(i = 0; i < length; i++ ){
            for(j = 0; j < length; j++){
                if(array[j] > array[j + 1]){
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    countT = countT + 1;
                }
                countI = countI+ 1;
            }
            countI = countI + 1;
        }
        return array;
    }

    public void print(int[] arr){
        this.length = arr.length;
        for(int k = 0; k < length; k++){
            System.out.print(arr[k] + ", ");
        }
        System.out.println();
        System.out.println("Numero de trocas: " + countT);
        System.out.println("Numero de iteracoes: " + countI);
    }


}
