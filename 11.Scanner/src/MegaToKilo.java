import java.util.Scanner;

public class MegaToKilo {
    public static void MegaBytesKiloBytes(int kiloBytes){
        if ( kiloBytes < 0 ){
            System.out.println("Invalid input. Please enter a non-negative number");
        }
        else{
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and "
                                + remainingKiloBytes + " KB");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of kilobytes: ");
        int kiloBytes = scan.nextInt();
        MegaBytesKiloBytes(kiloBytes);
    }
}
