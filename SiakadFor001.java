import java.util.Scanner;

public class SiakadFor001 {
    public static void main(String[] args) {
        double nilai,tertinggi = 0, terendah = 100;
        Scanner scanner = new Scanner(System.in); 

        for (int i = 1; i <= 30; i++){
            System.out.print("Masukkan nilai ke-" + i + ": ");
            
            nilai = scanner.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            
            }
        }   System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            scanner.close();

        }
    }
    
