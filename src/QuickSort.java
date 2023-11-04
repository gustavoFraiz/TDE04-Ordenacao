public class QuickSort {
    int countI, countT;

    public QuickSort(){
        this.countI = 0;
        this.countT = 0;
    }
    public int[] quickSort(int[] arr, int comeco, int fim){

        if(comeco < fim){
            int index = particao(arr, comeco, fim);

            quickSort(arr, comeco, index - 1);
            countI = countI + 1;
            quickSort(arr, index+1, fim);
            countI = countI + 1;
        }

        return arr;
    }

    private int particao(int[] arr, int comeco, int fim){
        int aux = 0;
        int pivo = arr[fim];
        int i = (comeco - 1);

        for(int j = comeco; j<fim; j++){
            if(arr[j] <= pivo){
                i++;
                aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
                countT = countT + 1;
            }
            countI = countI + 1;
        }

        aux = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = aux;
        countT = countT + 1;

        return i + 1;
    }


    public void print(int[] arr, int length){

        for(int k = 0; k < length; k++){
            System.out.print(arr[k] + ", ");
        }
        System.out.println();
        System.out.println("Numero de trocas: " + countT);
        System.out.println("Numero de iteracoes: " + countI);
    }
}
