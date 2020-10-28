package ratarata_nilai;

import java.util.Scanner;

/**
 * @author NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS            : IF 10K
 * NIM              : 10119909
 */
public class PBO10119909Latihan21 {

    public static void main(String[] args) {
        int jumlah_mhs;
        double nilai_mhs, ratarata;
        double total_nilai = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlah_mhs = scanner.nextInt();
        for (int i =1; i <= jumlah_mhs; i++) {
            System.out.printf("Nilai Mahasiswa ke-%1$d : ", i);
            nilai_mhs = scanner.nextDouble();
            total_nilai += nilai_mhs;
        }
        ratarata = total_nilai / jumlah_mhs;
        System.out.printf("%nMaka, rata-rata nilainya adalah : %1$.1f%n",ratarata);
    }
}
