package Question_4;
public class Sort{
    static void arraySort(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] array = {'f','g','i', 'q', 'b', 'z'};
        arraySort(array);

        // Print the sorted array
        for (char s : array) {
            System.out.print(s+ " ");
        }
    }
}
