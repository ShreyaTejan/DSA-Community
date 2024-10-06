public class binarySortArr {
    public static int binarySearch(int array[], int toFind){
        int start = 0;
        int end = array.length - 1;

        while (start<= end) {
            int mid= (start + end)/2;

            if (array [mid] == toFind) {
                return mid;
                
            }
            
            if (array[mid] <toFind) {
                start = mid+1;
                
            }

            else{
                end=mid - 1;
            }
        }

        return -1;
    }

   

    public static void main(String[] args) {
        int array[]= {9,13,15,21,55,77,79,85,90};
        int toFind = 21;

        System.out.println("The number is at this index => " + binarySearch(array, toFind));
    }
}

