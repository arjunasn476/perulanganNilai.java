package Perulangan;

import java.util.Scanner;

public class perulanganNilai {
    public static void main(String[] args) {
    
        int jumlahSiswa;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Siswa: ");
        jumlahSiswa = s.nextInt();
        
        double[] nilaiSiswa = new double[jumlahSiswa];
        double totalNilai = 0.0;
        
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nilai untuk siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = s.nextDouble();  
            totalNilai += nilaiSiswa[i];  
        }

        double rataRata = totalNilai / jumlahSiswa;
        
        System.out.println("\nDaftar Nilai Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + nilaiSiswa[i]);
        }
        
        System.out.println("\nTotal Nilai: " + totalNilai);
        System.out.println("Rata-Rata Nilai: " + rataRata);

        s.close();
    }
}
