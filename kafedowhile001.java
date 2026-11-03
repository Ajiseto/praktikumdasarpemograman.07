import java.util.Scanner;
public class kafedowhile001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hargakopi = 5000, hargateh = 3000, hargasusu = 4000;
        double totalharga;
        int jumlahkopi, jumlahteh, jumlahsusu;
        scanner.nextLine(); 
        
        do{System.out.print("masukan nama pelangngan (ketik 'keluar' untuk berhenti): ");
            String namaPelanggan = scanner.nextLine();
            if (namaPelanggan.equalsIgnoreCase("keluar")){
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("jumlah kopi: ");
            jumlahkopi = scanner.nextInt();
            System.out.print("jumlah teh: ");
            jumlahteh = scanner.nextInt();
            System.out.print("jumlah susu: ");
            jumlahsusu = scanner.nextInt();

            totalharga=(hargakopi * jumlahkopi) + (hargateh * jumlahteh) + (hargasusu * jumlahsusu);
            System.out.println("Total harga: " + totalharga);
            scanner.nextLine();
            
        }while (true);

        System.out.println("Program selesai.");
        scanner.close();
    }
}