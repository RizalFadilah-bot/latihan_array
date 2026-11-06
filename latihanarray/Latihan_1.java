import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nim = new String[3];
        String[] nama = new String[3];
        double[] uts = new double[3];
        double[] uas = new double[3];
        double[] nilai = new double[3];
        String[] index = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM  : ");
            nim[i] = input.nextLine();

            System.out.print("Nama : ");
            nama[i] = input.nextLine();

            System.out.print("UTS  : ");
            uts[i] = input.nextDouble();

            System.out.print("UAS  : ");
            uas[i] = input.nextDouble();
            input.nextLine();

            nilai[i] = (uts[i] * 0.5) + (uas[i] * 0.5);

            if (nilai[i] >= 80) {
                index[i] = "A";
            } else if (nilai[i] >= 70) {
                index[i] = "B";
            } else if (nilai[i] >= 60) {
                index[i] = "C";
            } else if (nilai[i] >= 50) {
                index[i] = "D";
            } else {
                index[i] = "E";
            }
        }

        System.out.println("\n==========================================================");
        System.out.println("No\tNIM\tNama\tUTS\tUAS\tNilai Akhir\tIndex");
        System.out.println("==========================================================");

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "\t" + nim[i] + "\t"
                    + nama[i] + "\t" + uts[i] + "\t"
                    + uas[i] + "\t" + nilai[i] + "\t\t"
                    + index[i]);
        }

        System.out.println("==========================================================");
    }
}