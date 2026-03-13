import java.util.ArrayList;
import java.util.Scanner;

class MatKul {
    String nama;
    int sks;
    String nilai;
    
    MatKul(String nama, int sks, String nilai) {
        this.nama = nama;
        this.sks = sks;
        this.nilai = nilai.toUpperCase();
    }
    
    double hitungBobotNilai() {
        if (nilai.equals("A")) return 4.0;
        if (nilai.equals("A-")) return 3.7;
        if (nilai.equals("B+")) return 3.3;
        if (nilai.equals("B")) return 3.0;
        if (nilai.equals("B-")) return 2.7;
        if (nilai.equals("C+")) return 2.3;
        if (nilai.equals("C")) return 2.0;
        if (nilai.equals("D")) return 1.0;
        return 0.0;
    }
    
    double dapatkanNilaiMutu() {
        return hitungBobotNilai() * sks;
    }
}

class Mahasiswa {
    ArrayList<MatKul> kartuHasilStudi = new ArrayList<>();
    
    void tambahMatKul(MatKul mk) {
        kartuHasilStudi.add(mk);
    }
    
    double hitungIPS() {
        double totalMutu = 0;
        int totalSKS = 0;
        
        for (MatKul mk : kartuHasilStudi) {
            totalMutu += mk.dapatkanNilaiMutu();
            totalSKS += mk.sks;
        }

        if (totalSKS == 0) return 0;
        return totalMutu / totalSKS;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.println("=== KALKULATOR IPS MAHASISWA ===\n");
        
        System.out.print("Berapa jumlah MatKul yang mau dihitung? ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 1; i <= jumlahMK; i++) {
            System.out.println("\n--- Mata Kuliah #" + i + " ---");
            
            System.out.print("Nama Mata Kuliah: ");
            String namaMK = scanner.nextLine();
            
            System.out.print("Jumlah SKS: ");
            int sksMK = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Nilai (A, A-, B+, dll): ");
            String nilaiMK = scanner.nextLine();
            
            MatKul mk = new MatKul(namaMK, sksMK, nilaiMK);
            mahasiswa.tambahMatKul(mk);
            
            System.out.println("✓ Data tersimpan!");
        }
        
        double ips = mahasiswa.hitungIPS();
        
        System.out.println("\n================================");
        System.out.println("HASIL PERHITUNGAN IPS");
        System.out.println("================================");
        System.out.println("Jumlah MK: " + mahasiswa.kartuHasilStudi.size() + " MatKul");
        System.out.printf("IPS Semester: %.2f\n", ips);
        System.out.println("================================");
        
        scanner.close();
    }
}