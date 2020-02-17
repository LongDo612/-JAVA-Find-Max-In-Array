import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int size;
        int[] array;
        do {
            System.out.println("Enter array size: ");
            size = scanner.nextInt();
        }while (size >= 20);

        array = new int[size];

        for (int i=0;i<array.length;i++){
            System.out.print("Enter element "+ (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i=0;i<array.length;i++){
            if (array[max] < array[i]){
                max = i;
            }
        }

        System.out.println("Max value in array is: " + array[max]);
    }
}
