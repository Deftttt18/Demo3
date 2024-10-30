import java.util.Scanner;

public class NotaPemesananRestoran {


    public static void main(String[] args) {
        // Daftar menu makanan
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Ayam Goreng", "Sate Ayam"};
        int[] harga = {15000, 12000, 10000, 13000}; // harga per item

        // Scanner untuk input pengguna
        Scanner input = new Scanner(System.in);

        // Tampilkan menu
        System.out.println("=== MENU RESTORAN ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        // Input pesanan dari pengguna
        System.out.print("\nMasukkan nomor menu yang ingin dipesan: ");
        int pilihan = input.nextInt();
        if (pilihan < 1 || pilihan > menu.length) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan untuk " + menu[pilihan - 1] + ": ");
        int jumlah = input.nextInt();

        // Hitung total harga
        int totalHarga = harga[pilihan - 1] * jumlah;

        // Tampilkan nota pemesanan
        System.out.println("\n=== NOTA PEMESANAN ===");
        System.out.println("Menu yang dipesan: " + menu[pilihan - 1]);
        System.out.println("Harga per item  : Rp " + harga[pilihan - 1]);
        System.out.println("Jumlah pesanan  : " + jumlah);
        System.out.println("Total harga     : Rp " + totalHarga);
        System.out.println("Terimakasih Sudah Membeli");

        input.close();
    }

}