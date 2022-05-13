class Q6 {
    public static void main (String[] args) {
        int[] array = {4,89,21,84,36,5,0,8};
        bubbleSort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        for (int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }
}