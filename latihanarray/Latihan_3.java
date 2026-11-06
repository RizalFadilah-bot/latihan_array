import java.util.Scanner;

public class Latihan_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama = new String[3];
        String[] kode = new String[3];
        String[] barang = new String[3];

        int[] jumlah = new int[3];
        int[] harga = new int[3];
        int[] bayar = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Penjualan ke-" + (i + 1));

            System.out.print("Nama Pembeli : ");
            nama[i] = input.nextLine();

            System.out.print("Kode Barang (A01/B02/C02) : ");
            kode[i] = input.nextLine();

            System.out.print("Jumlah : ");
            jumlah[i] = input.nextInt();
            input.nextLine();

            if (kode[i].equals("A01")) {
                barang[i] = "Hardisk";
                harga[i] = 700000;
            } else if (kode[i].equals("B02")) {
                barang[i] = "Monitor";
                harga[i] = 800000;
            } else if (kode[i].equals("C02")) {
                barang[i] = "Mouse";
                harga[i] = 50000;
            } else {
                barang[i] = "Tidak Diketahui";
                harga[i] = 0;
            }

            bayar[i] = harga[i] * jumlah[i];
        }

        System.out.println("\n==================================================================");
        System.out.println("No\tNama\tKode\tBarang\tJumlah\tHarga\tBayar");
        System.out.println("==================================================================");

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "\t" + nama[i] + "\t"
                    + kode[i] + "\t" + barang[i] + "\t"
                    + jumlah[i] + "\t" + harga[i] + "\t"
                    + bayar[i]);
        }

        System.out.println("==================================================================");
    }
}