import java.util.Scanner;

public class Latihan_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama = new String[3];
        String[] jurusan = new String[3];
        String[] kelas = new String[3];

        int[] jumlah = new int[3];
        int[] harga = new int[3];
        int[] bayar = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Pembeli ke-" + (i + 1));

            System.out.print("Nama Pembeli : ");
            nama[i] = input.nextLine();

            System.out.print("Jurusan (Bandung/Jakarta) : ");
            jurusan[i] = input.nextLine();

            System.out.print("Kelas (Bisnis/Ekonomi) : ");
            kelas[i] = input.nextLine();

            System.out.print("Jumlah Tiket : ");
            jumlah[i] = input.nextInt();
            input.nextLine();

            if (jurusan[i].equalsIgnoreCase("Bandung")) {
                if (kelas[i].equalsIgnoreCase("Bisnis")) {
                    harga[i] = 40000;
                } else {
                    harga[i] = 20000;
                }
            } else if (jurusan[i].equalsIgnoreCase("Jakarta")) {
                if (kelas[i].equalsIgnoreCase("Bisnis")) {
                    harga[i] = 60000;
                } else {
                    harga[i] = 40000;
                }
            }

            bayar[i] = harga[i] * jumlah[i];
        }

        System.out.println("\n==============================================================");
        System.out.println("No\tNama\tJurusan\tKelas\tJumlah\tHarga\tBayar");
        System.out.println("==============================================================");

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "\t" + nama[i] + "\t"
                    + jurusan[i] + "\t" + kelas[i] + "\t"
                    + jumlah[i] + "\t" + harga[i] + "\t"
                    + bayar[i]);
        }

        System.out.println("==============================================================");
    }
}