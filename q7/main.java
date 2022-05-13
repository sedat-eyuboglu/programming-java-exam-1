class Q7 {
    public static void main (String[] args) {
        int[] array = {0,4,5,8,21,36,84,89};
        int result = binarySearch(array, 99);
        System.out.print(result);
    }

    public static int binarySearch(int arr[], int key){
        int first = 0;
        int last = arr.length-1;
        int mid = last/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                return mid;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return -1;
    }
}