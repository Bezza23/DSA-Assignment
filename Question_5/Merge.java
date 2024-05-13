package Question_5;

public class Merge {
    public void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, j = 0, k = 0;
        // Compare elements of left and right arrays and merge them into array
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            }
            else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftLength) {
            array[k++] = leftArray[i++];
        }

        while (j < rightLength) {
            array[k++] = rightArray[j++];
        }
    }
    public static void main(String[] args){
        int[] array={3,8,9,6,5,2};
        int[] leftArray={3,8,9};
        int[] rightArray={6,5,2};
        merge(array,leftArray,rightArray);

}
