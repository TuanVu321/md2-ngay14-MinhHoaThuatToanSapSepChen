import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }


    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                System.out.println("Swap " + list[i] + " with " + list[k]);
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
            System.out.print("List after the sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }

        }
        System.out.print("List after the sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        System.out.println();


    }
}
