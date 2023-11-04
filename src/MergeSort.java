public class MergeSort {
    int countT, countI;

    public MergeSort(){
        this.countT = 0;
        this.countI = 0;
    }
    public void mergeSort(int[] arr, int length){

        if(length == 1){return;}

        int pivo = length / 2;

        int[] arrEsquerda = new int[pivo];
        int[] arrDireita = new int[length - pivo];

        for (int i = 0; i < pivo; i++){
            arrEsquerda[i] = arr[i];
        }
        for (int i = pivo; i < length; i++){
            arrDireita[i - pivo] = arr[i];
        }

        mergeSort(arrEsquerda, pivo);
        mergeSort(arrDireita, length - pivo);

        merge(arr, arrEsquerda, arrDireita, pivo, length - pivo);
    }

    public void merge(int[]arr, int[]arrEsquerda, int[]arrDireita, int tamanhoEsquerda, int tamanhoDireita){

        int i = 0, k = 0, j = 0;

        while(i < tamanhoEsquerda && j < tamanhoDireita){
            if(arrEsquerda[i] <= arrDireita[j]){
                arr[k++] = arrEsquerda[i++];
                countT = countT + 1;
            }
            else{
                arr[k++] = arrDireita[j++];
                countT = countT + 1;
            }
        }
        while(i < tamanhoEsquerda){
            arr[k++] = arrEsquerda[i++];
            countT = countT + 1;
        }
        while(j < tamanhoDireita){
            arr[k++] = arrDireita[j++];
            countT = countT + 1;
        }

    }

    public void print(int[] arr, int length){

        for(int k = 0; k < length; k++){
            System.out.print(arr[k] + ", ");
        }
        System.out.println();
        System.out.println("Numero de trocas: " + countT);
    }

}
