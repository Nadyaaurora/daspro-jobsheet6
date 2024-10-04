import java.util.Scanner;
public class Latihan3 {

    public static void main(String[] args){
        Scanner input19 = new Scanner(System.in);
        String merk, kategori;
        int ukuran, harga;

        System.out.print("Masukkan merk sepatu : ");
        merk = input19.nextLine();

        System.out.print("Masukkan kategori sepatu : ");
        kategori = input19.nextLine();

        System.out.print("Masukkan ukuran sepatu : ");
        ukuran = input19.nextInt();

        if (kategori.equals("slip on") && merk.equals("specs")) {
            if (ukuran >= 36 && ukuran <= 40) {
                harga = 800000;
                System.out.println("sepatu tersebut berharga " + harga);
            }
        }

        else if (kategori.equals("high top") && merk.equals("specs")) {
           if (ukuran >= 40 && ukuran <= 44) {
                harga = 1200000;
                System.out.println("sepatu tersebut berharga " + harga);
           } 
        }

        else if (kategori.equals("woman") && merk.equals("910")) {
            if (ukuran >= 36 && ukuran <= 41) {
                 harga = 1000000;
                 System.out.println("sepatu tersebut berharga " + harga);
            } 
         }

         else if (kategori.equals("man") && merk.equals("910")) {
            if (ukuran >= 41 && ukuran <= 44) {
                 harga = 1800000;
                 System.out.println("sepatu tersebut berharga " + harga);
            } 
         } 

         else if (kategori.equals("kids") && merk.equals("ortus")) {
            if (ukuran >= 36 && ukuran <= 40) {
                 harga = 750000;
                 System.out.println("sepatu tersebut berharga " + harga);
            } 
         } 

         else if (kategori.equals("adult") && merk.equals("ortus")) {
            if (ukuran >= 40 && ukuran <= 44) {
                 harga = 1500000;
                 System.out.println("sepatu tersebut berharga " + harga);
            } 
         } else {
            System.out.println("tidak valid");
         } 
    }
}