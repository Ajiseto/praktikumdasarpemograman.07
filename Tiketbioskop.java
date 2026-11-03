import java.util.Scanner;

public class Tiketbioskop {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);  
      int hargatiket = 50000;
      int tiketterjual= 0;
      double pendapatanhariini = 0;
      System.out.print("=====Sistem penjualana tiket bioskop=====\n");
      System.out.print("Ketik 0 untuuk selesai dan melihat total penghasilan hari ini\n");

      while(true){
        System.out.println("Masukan jumlah pembeli tiket penonton:");
        int jumlahpembelitiket = scanner.nextInt();
        
        if (jumlahpembelitiket <0){
            System.out.println("Jumlah pembeli tiket tidak valid. Masukkan jumlah yang benar.");
            continue;
        }
        if (jumlahpembelitiket == 0){
            break;
        }
        
        int hargaasli = hargatiket * jumlahpembelitiket;
        double diskon = 0;

        if (jumlahpembelitiket > 10){
            diskon = 0.15;
        } else if (jumlahpembelitiket > 4){
            diskon = 0.10;
        }
        double  totalhargasetelahdiskon = hargaasli * (1 - diskon);
        tiketterjual += jumlahpembelitiket;
        pendapatanhariini += totalhargasetelahdiskon;

        System.out.printf("Diskon yang didapatkan: %.0f%%\n", diskon * 100);
        System.out.printf("Total harga yang harus dibayar: Rp %.0f\n\n", totalhargasetelahdiskon);
      }
      System.out.println("================================");
      System.out.println("Laporan penjualan tiket hari ini:");
      System.out.println("Total tiket terjual: "+ tiketterjual +" tiket"); 
      System.out.printf("Total pendapatan hari ini: Rp %.0f\n", pendapatanhariini);
      System.out.println("===============================");
      scanner.close();
       
    }
}