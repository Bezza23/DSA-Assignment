package Question_1;
import java.util.Scanner;
public class NumberSearch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("size of the array: ");
        int size = keyboard.nextInt();


        int[] numbers = new int[size];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = keyboard.nextInt();

        }


        System.out.print("number to be searched?: ");
        int searchNumber = keyboard.nextInt();


        int count = 0;
        for (int num : numbers) {
            if (num == searchNumber) {
                count++;
            }
        }


        if (count > 0) {
            System.out.println("The number " + searchNumber + " appears " + count + " times in the array.");
        } else {
            System.out.println("The number " + searchNumber + " isn't available.");
        }

        Scanner.close();
    }
}



