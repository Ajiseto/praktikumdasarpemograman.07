import java.util.Scanner;

public class Biayaparkir01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenis, durasi, total = 0;
        
        do {
            System.out.print("Input jenis (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = scanner.nextInt();
            
            if ((jenis == 1) || (jenis == 2)) {
                System.out.print("Input durasi (jam): ");
                durasi = scanner.nextInt();     
                if (jenis == 1) {
                    total += durasi * 3000; 
                } else {
                    total += durasi * 2000;
                }
            }
            
        } while (jenis != 0);
        
        System.out.println("Total pembayaran parkir: Rp " + total);
        scanner.close();
    }
}

