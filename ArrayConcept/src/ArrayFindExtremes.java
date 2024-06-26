import java.util.Scanner;

public class ArrayFindExtremes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = s.nextInt();
        int[] n = new int[size];
        System.out.println("Enter " + size + " values: ");
        
        for (int i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
        }
        s.close();
        
        findExtremes(n);
    }
    
    static void findExtremes(int[] n) {
        if (n.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : n) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}